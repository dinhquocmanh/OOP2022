/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.util.*;
/**
 *
 * @author dmanh
 */
class Point{
    private double x;
    private double y;

    public Point() {
    }
    public Point(Point p) {
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
    
    public double distance(Point secondPoint){
        double d = Math.sqrt(Math.pow((this.x-secondPoint.x),2)+Math.pow((this.y-secondPoint.y),2));
        return d;
    }
    
    public double distance(Point p1, Point p2){
        return 0;
    }
    
    public String toString(){
        return "";
    }
    
    
}

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double x1 = sc.nextDouble();            
            double y1 = sc.nextDouble();
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();
            
            Point p1 = new Point(x1,y1);
            Point p2 = new Point(x2,y2);
            double dis = p1.distance(p2);
            System.out.printf("%.4f%n",dis);
        }
    }
}
/*
2
0 0 0 5
0 199 5 6
*/