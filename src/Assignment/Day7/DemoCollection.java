/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day7;

/**
 *
 * @author vichet
 */
public class DemoCollection {
    private Object o;
    public DemoCollection(Object b){
        o = b;
    }

    @Override
    public String toString() {
        return o.toString();
    }
    public static void main(String[] args) {
        DemoCollection d = new DemoCollection("Hello");
        System.out.println(d);
    }
}
