/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2.Assignment;

/**
 *
 * @author Administrator
 */
public class point2ds {
    private double x,y;

    public point2ds() {
        x = 0.0;
        y = 0.0;
    }
    public point2ds(double x,double y){
        this.x = x;
        this.y = y;
    }
    public void show(){
        System.out.println("cordinator x = "+x + " and y = "+y);
   }
    public static void main(String[] args) {
        point2ds p = new point2ds(10, 20);
        p.show();
    }
}
