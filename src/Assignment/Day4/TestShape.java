/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day4;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestShape {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        String type = "";
        
        Shape s[] = new Shape[10];
        boolean flag= true;
        int i=0;
        do{
            System.out.println("What type of shape do you want?");
            type = keyboard.next();
            switch(type.toLowerCase()){
                case "circle":
                    s[i] = new Circle("Circle");
                    break;
                case "rectangle":
                    s[i] = new Rectangle("Rectangle");
                    break;
                case "triangle":
                    s[i] = new Triangle("Triangle");
                    break;
                case "square":
                    s[i] = new Square("Square");
                    break;
                case "erasecircle":
                        
                    break;
                default:
                    System.out.println("Incorrect Shape type! Please try agina");
                    --i;
                    break;
                case "exit":
                    flag=false;
                    break;
            }
            i++;
        }while(flag);
        System.out.println("--------------------------");
        for(Shape va : s){
            if(va instanceof Circle){
                ((Circle)va).draw();
            }else if(va instanceof Rectangle){
                ((Rectangle)va).draw();
            }else if(va instanceof Triangle){
                ((Triangle)va).draw();
            }else if(va instanceof Square){
                ((Square)va).draw();
            }else{
                
            }
        
        }
        System.out.println("----------------------------");
    }
}

/*
Circle c=null;
                    for(int j=0;j<s.length;j++){
                        if(s[j] instanceof Circle){
                            c = (Circle)s[j];
                        }
                    }
                    if(c!=null)
                    c.earas();
                    else
                        System.out.println("No circle exists");
*/