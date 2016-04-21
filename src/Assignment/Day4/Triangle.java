/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day4;

/**
 *
 * @author Administrator
 */
public class Triangle extends Shape{

    public Triangle(String name) {
        super(name);
    }

    
    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }

    @Override
    public void earas() {
        System.out.println("Triangle Earas");
    }
    
}
