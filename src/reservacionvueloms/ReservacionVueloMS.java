/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservacionvueloms;

import coneccion.*;
import reservacionvuelos.interfaces.*;

/**
 *
 * @author Anthony
 */
public class ReservacionVueloMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        INSERT inserto = new INSERT();
//        String campos[] = {"codigo","edad","ciudad","aa","bb","cc"};
//        String valores[]={"1","15","sd","12","123","44"};
//        inserto.insertStringsDato("pasajero",campos,valores);
v_Ingreso principal = new v_Ingreso();
       principal.setLocationRelativeTo(null);
       principal.setVisible(true);
    }
    
}
