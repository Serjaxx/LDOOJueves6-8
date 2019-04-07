package conector;

import java.awt.HeadlessException;
import java.sql.*;

public class Conector {

        public static String Url = "jdbc:mysql//localhost/login_bd";
        public static String Usuario = "root";
        public static String Contraseña = "mysql";
        
        public static Connection conectar() {
            Connection conexion = null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(Url, Usuario, Contraseña);
                System.out.println("Conexion Establecida");   
            }
            catch (HeadlessException | ClassNotFoundException | SQLException e){
                System.out.println("Error: " + e);
            }
            return conexion;
        }
        
        public static void desconectar(){
            Connection conexion = null;
            if(conexion == null){
                System.out.println("La variable de conexion a sido puesta en null");               
            }
        }
}
