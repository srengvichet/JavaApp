/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment.Day3;

/**
 *
 * @author Administrator
 */
public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(2, 3);
        Point2D p2 = new Point2D(3, 5);
        double total = p1.calcDistance(p2);
        System.out.println(p1+ " Total = "+total);
        Point3D p3 = new Point3D(2, 3, 4);
        System.out.println(p3);
//        if(p.equals(p2)){
//            System.out.println("Equal!");
//        }else{
//            System.out.println("Not Equal!");
//        }
    }
}
