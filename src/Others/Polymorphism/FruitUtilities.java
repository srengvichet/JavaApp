/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others.Polymorphism;

/**
 *
 * @author Administrator
 */
public class FruitUtilities {
    private static int counter=0;
    public static void addFruit(Fruit f, Fruit[] basket){
        if(counter<basket.length){
            basket[counter++]=f;
        }else{
            System.out.println("Basket is Full!!!");
        }
    }

    
}
