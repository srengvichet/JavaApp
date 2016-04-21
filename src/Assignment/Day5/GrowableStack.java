/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day5;

import Assignment.Day5.JavaBean.Employee;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class GrowableStack implements Stack{
    int top;
    Employee emp[];
    public GrowableStack(int size){
        emp = new Employee[size];
        top = -1;
    }
    @Override
    public void push(Employee e){
        int length;
        if(isFull()){
            Employee tmp[] = new Employee[emp.length];
            for(int i = 0; i<emp.length;i++){
                tmp[i] = new Employee(emp[i]);
            }
           length =emp.length+1;
           emp = new Employee[length];
           for(int i = 0  ;i < tmp.length;i++){
               emp[i] = new Employee(tmp[i]);
           }
           emp[++top] = new Employee(e);
       }else{
           emp[++top] = new Employee(e);
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
     * @return
     */
    @Override
    public Employee pop(){
        int value = top--;
        Employee e = new Employee(emp[value]);
        emp[value] = null;
        return e;
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
    public void display() {
       if(!isEmpty()){
            for(int i = emp.length-1; i>=0;i--){
                if(emp[i] != null)
                System.out.println(emp[i]);
            }
        }
    }
    
}
