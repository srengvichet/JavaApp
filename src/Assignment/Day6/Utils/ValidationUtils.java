/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day6.Utils;

import Assignment.Day6.Customer;
import Assignment.Day6.CustomerException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ValidationUtils {
    private static Date start = new Date(01-01-2010);
    private static Date end = new Date(01-01-2020);
    private static SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    
    public static void validateDob(Customer c) throws CustomerException{
        if(c.getDob().before(start) || c.getDob().after(end)){
            throw new CustomerException("Invalide Date of birth ");
        }else{
             
             System.out.println("Valide Date of birth");
        }
    }
    public static void validateEmail(Customer c) throws CustomerException{
        if(c.getEmail().contains("@") ){
            System.out.println("Valide Email");
        }else{
            throw new CustomerException("Invalidate Email");
        }
    }
    public static void validePassword(Customer c) throws CustomerException{
        if(c.getPassword().length()>5 && c.getPassword().length()<=10){
            System.out.println("Valide password ");
        }else{
            throw new CustomerException("Invalide Password");
        }
    }
}
