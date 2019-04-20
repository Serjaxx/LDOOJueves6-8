package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection connection;
    
    public static Connection getConnection(){
        try {
            if(connection == null){
                Runtime.getRuntime().addShutdownHook(new getClose());
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?verifyServerCertificate=false&useSSL=true", "root", "root");
            }
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Conexion fallida", e);
        }
    }
    
    static class getClose extends Thread{
        @Override
        public void run(){
            try {
            Connection conn = Conexion.getConnection();
            conn.close();                
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public static void main(String[] args) {
        Conexion connection = new Conexion();
    }
}
