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
public interface Stack {
    int SIZE = 10;
    void push(Employee e);
    Employee pop();
    boolean isFull();
    boolean isEmpty();
    void display();
}
