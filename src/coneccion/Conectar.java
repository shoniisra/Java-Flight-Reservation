/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coneccion;

/**
 *
 * @author Anthony
 */
import java.sql.*;

public class Conectar{

    static String bd = "test";
    static String login = "shoniisra";
    static String password = "qwerty";
    static String url = "jdbc:mysql://localhost/"+bd;
    Connection connection = null;

    public Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,login,password);
            if (connection!=null){
                System.out.println("Conexión a base de datos "+bd+" OK\n");
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void desconectar(){
        try{
            System.out.println("Cerrando conexion");
            connection.close();
        }catch(Exception ex){}
    }


}
