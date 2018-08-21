/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioWebException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ZbookG3
 */
@WebService(serviceName = "ServicioWeb")
public class ServicioWeb {

    @WebMethod(operationName = "lesser")
    public String lesser(@WebParam(name = "one") Integer one, @WebParam(name = "two") Integer two, @WebParam(name = "three")Integer three) throws ServicioWebException {
        if (one == null || two == null || three == null) {
            throw new ServicioWebException("You must enter 3 values.");
        }
        else if (one < two && one < three){
            return "The lesser number is:" + one;
        }
        else if (two < one && two < three){
            return "The lesser number is:" + two;
        }else{
            return "The lesser number is:" + three;
        }
    }
}
