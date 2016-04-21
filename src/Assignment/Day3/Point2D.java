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
public class Point2D {
    private double x,y;
    private Point2D point;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Point2D p = (Point2D)obj;
        if(p.x == this.x && p.y == this.y){
            return true;
        }else{
            return false;
        }
     }
    public Point2D getInstance(){
        if(point != null){
            return new Point2D();
        }else{
            return point;
        }
    }
    public double calcDistance(Point2D d){
        return Math.sqrt(Math.pow((x-d.x), 2)+Math.pow((y-d.y),2));
    }
    
}
