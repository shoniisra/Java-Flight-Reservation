/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anthony
 */
public class SELECT {
    
    Conectar conn = new Conectar();
    
    public void select1DatoCondicion(String tabla, String valor, String condicion)
    {
        String sql="SELECT "+ valor+" FROM "+ tabla +" WHERE "+valor+" = '"+"'";
    }
    
    public int loguinAdmin(String user,String clave){
      Conectar conec = new Conectar();
        String regresoc=null;
        String regresou=null;
        int cont=0;
        String sql = "SELECT * FROM pasajero;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()&&cont==0){
                regresou=rs.getString(6);
                regresoc=rs.getString(7);
                System.out.println(regresou+" "+regresoc);
                if(regresoc.equals(clave) && regresou.equals(user))
                    cont=1;
                else
                    cont=0;
            }
            //return regreso;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
      return cont;
  }
}