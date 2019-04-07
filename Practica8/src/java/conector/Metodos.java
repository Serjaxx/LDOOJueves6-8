package conector;

import java.sql.*;

public class Metodos {
    
    Connection conexion;
    PreparedStatement sentencia_preparada;
    ResultSet resultado;
    String sql;
    
    public void buscarUsuarioRegistrado(String usuario, String contraseña){
        
        try {
            conexion = Conector.conectar();
            sql = "SELECT usuario, contraseña FROM usuarios_registrados WHERE usuario = '"+usuario+"' && contraseña = '"+contraseña+"'";
            sentencia_preparada = conexion.prepareStatement(sql);
            resultado = sentencia_preparada.executeQuery();
            if(resultado.next()){
                usuario = resultado.getString("usuario");
                contraseña = resultado.getString("contraseña");
            }
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }
        
    }
    
}
