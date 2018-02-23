/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

import Clases.Tarifa;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Anthony
 */
public class INSERT {
    
    Conectar conn = new Conectar();
    
    public void insertStringsDato(String tabla, String campos[], String valores[])
    {
        String sql="INSERT INTO "+tabla+"( ";
        for (int i = 0; i < campos.length; i++) {
            //sql=sql+campos[i]+",";
            if(i==0)
             sql=sql+campos[i];
            else
              sql=sql+","+campos[i];
            //sql=sql+")";
        }
        sql=sql+") VALUES (";
        for (int i = 1; i < valores.length; i++) {
            sql=sql+"?,";
            if(i==(valores.length-1))
            {
                sql=sql+"?)";
            }
        }
        
        PreparedStatement pst=null;
        try {
            pst= conn.getConnection().prepareStatement(sql);
            for (int i = 0; i < valores.length; i++) {
                if( i==0 )
                    pst.setInt(1,Integer.valueOf(valores[i]));
                else
                {
                    pst.setString(i+1, valores[i]);
                }
            }
            JOptionPane.showMessageDialog(null,sql);
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }finally{
            try{
                pst.close();
                conn.desconectar();
            }catch(Exception ex){
                
            }
        }
        
        
    }
    
    public void insertTarifa(Tarifa tarifa)
    {
        String sql="INSERT INTO Tarifa(codigo_tar,clase_tar,precio_tar,codigo_vue) VALUES(?,?,?,?)";
        PreparedStatement pst = null;
        try {
            pst=conn.getConnection().prepareStatement(sql);
            pst.setInt(1, tarifa.getCodigo_tar());
            pst.setString(2, tarifa.getClase_tar());
            pst.setFloat(3, tarifa.getPrecio_tar());
            pst.setInt(4, tarifa.getCodigo_vue());
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }finally{
            try{
                pst.close();
                conn.desconectar();
            }catch(Exception ex){
                
            }
        }
        
    }
}
