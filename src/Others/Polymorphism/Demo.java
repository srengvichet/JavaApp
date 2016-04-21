/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Others.Polymorphism;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Demo {
    public static void main(String[] args) {
        Mango m = new Mango();
        Apple a = new Apple();
        Fruit f[] = new Fruit[3];
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter fruit");
        boolean flag= false;
        while(!flag){
            switch(keyboard.next()){
            case "Apple":
                FruitUtilities.addFruit((Fruit)a, f);
                break;
            case "Mango":
                FruitUtilities.addFruit((Fruit)m, f);
                break;
            default:
                flag = true;
            }
        }
        for(Fruit v : f){
            System.out.println(v);
        }
        
    }
}
