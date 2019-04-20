package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consultas extends Conexion{
    
    public boolean autenticacion(String usuario, String contraseña){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "select * from registros where usuario = ? and contraseña = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
        } catch (Exception e) {
            System.out.print("Error" + e);
        } finally {
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                if(rs !=null) rs.close();
            } catch (Exception e) {
                System.out.print("Error" + e);
            }
        }
        
        return false;      
    }
    
    public static void main(String[] args) {
        Consultas co = new Consultas();
        System.out.print(co.autenticacion("sergiolona", "admin"));
    }
    
    public boolean registrar(String usuario, String contraseña, int nivel){
        
        PreparedStatement pst = null;
        
        try {
            String consulta = "insert into registros (usuario, contraseña, nivel) values(?,?,?)";
            pst.getConnection().prepareStatement(consulta);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            pst.setInt(3, nivel);
            
            if(pst.executeUpdate() == 1){
                return true;
            }
        } catch (Exception ex) {
            System.out.print("Error" + ex);
        }finally{
            try {
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
            } catch (Exception e) {
                System.out.print("Error" + e);
            }
        }
        
        return false;
    }
}
