/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day5;

import Assignment.Day5.JavaBean.Employee;

/**
 *
 * @author Administrator
 */
public class FixedStack implements Stack{
    private int top;
    private Employee[] emp;
    
    public FixedStack(int arraySize) {
        emp = new Employee[arraySize];
        for(int i = 0; i <emp.length;i++){
            emp[i] = null;
        }
        top = -1;
    }
    @Override
    public void push(Employee e){
        
        if(!isFull()){
            emp[++top]=new Employee(e);
        }else{
            System.out.println("Stack is full!");
        }
    }
    @Override
    public boolean isFull(){
        if(top == emp.length -1){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     */
    @Override
    public void display(){
        if(!isEmpty()){
            for(int i = emp.length-1; i>=0;i--){
                if(emp[i] != null)
                System.out.println(emp[i]);
            }
        }
    }
    @Override
    public boolean isEmpty() {
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    @Override
    public Employee pop(){
        int value = top--;
        Employee e = new Employee(emp[value]);
        emp[value] = null;
        return e;
        
    }
    /*
    public static void main(String[] args) {
        FixedStack f = new FixedStack(3);
        
        f.push(new Employee(1, "vichet", 200));
        f.push(new Employee(2, "sokha", 300));
        f.push(new Employee(3, "sophea", 400));
        //f.push(new Employee(4, "sokha", 300));
        f.display();
        System.out.println("----------------");
        System.out.println(f.pop());
        System.out.println(f.pop());
        System.out.println("-------------------------");
        f.display();
        
        f.push(new Employee(4, "sokha", 400));
        f.push(new Employee(5, "sokha", 500));
        f.push(new Employee(6, "sokha", 600));
        System.out.println("------------Display--------------");
         f.display();
    }
*/
}
