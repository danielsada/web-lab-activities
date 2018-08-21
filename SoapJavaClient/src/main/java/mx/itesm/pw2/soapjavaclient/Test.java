/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itesm.pw2.soapjavaclient;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ZbookG3
 */
public class Test {
    public static void main(String[] args){
        ServicioWeb_Service service = new ServicioWeb_Service(); ServicioWeb servicioWeb = service.getServicioWebPort();
        try {
            String respuesta = servicioWeb.lesser(10,1,20);
            Logger.getLogger(Test.class.getName()).log(Level.INFO, respuesta);
        } catch (ServicioWebException_Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex); }
    }
}
