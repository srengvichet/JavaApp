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
public class Point3D extends Point2D{
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +super.toString() + " z=" + z + '}';
    }
    
    
}
