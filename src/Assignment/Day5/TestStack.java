/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day5;

import Assignment.Day5.JavaBean.Employee;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestStack {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String type = "";
        int index = 0;
        boolean status = false;
        do {
            System.out.println("Type of Stack!");
            type = keyboard.nextLine();
            String answer;
            if (type.equalsIgnoreCase("fs")) {
                System.out.println("How many stack?");
                int size = keyboard.nextInt();
                FixedStack fs = new FixedStack(size);
                
                do {
                    System.out.println("Push or pop or display");
                    answer = keyboard.next();

                    if (answer.equalsIgnoreCase("push")) {
                        fs.push(readEmployee());
                    } else if(answer.equalsIgnoreCase("pop")) {
                        fs.pop();
                    }else{
                        fs.display();
                    }
                } while (answer.equalsIgnoreCase("push") || answer.equalsIgnoreCase("pop")|| answer.equalsIgnoreCase("display"));
            } else if (type.equalsIgnoreCase("gs")) {
                
                GrowableStack gs = new GrowableStack(1);
                do {
                    System.out.println("Push or pop or display");
                    answer = keyboard.next();

                    if (answer.equalsIgnoreCase("push")) {
                        gs.push(readEmployee());
                    } else if(answer.equalsIgnoreCase("pop")) {
                        gs.pop();
                    }else{
                        gs.display();
                    }
                } while (answer.equalsIgnoreCase("push") || answer.equalsIgnoreCase("pop")|| answer.equalsIgnoreCase("display"));
            }
        } while (type.equalsIgnoreCase("fs") || type.equalsIgnoreCase("gs"));
    }

    public static Employee readEmployee() {
        int id;
        String name;
        double salary;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Employee ID :");
        id = keyboard.nextInt();
        System.out.println("Enter Employee Name :");
        name = keyboard.next();
        System.out.println("Enter Employee Salary :");
        salary = keyboard.nextDouble();
        return new Employee(id, name, salary);
    }
}
