/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day6;

import Assignment.Day6.Utils.ValidationUtils;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class TestCustomer {
    public static void main(String[] args){
        
        
        try {
            Customer c = new Customer(1, "vichet@gmail.com", "abasdfsadfasdf", new Date(1-2-2019), 100);
            //ValidationUtils.validateEmail(c);
            //ValidationUtils.validePassword(c);
            ValidationUtils.validateDob(c);
            System.out.println(c);
        } catch (CustomerException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
