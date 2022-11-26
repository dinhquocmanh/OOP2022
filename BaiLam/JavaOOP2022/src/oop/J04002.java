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
class Rectange {
    private double width;
    private double height;
    private String color;

    public Rectange() {
        this.width =  1;
        this.height = 1;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {

        // to lower
        this.color = this.color.toLowerCase();
        
        // capital first letter
        this.color = this.color.substring(0,1).toUpperCase() + this.color.substring(1);
        
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return this.height*this.width;
    }
    
    public double findPerimeter(){
        return (this.height+this.width)*2;
    }
    
}

public class J04002 {
    // Khai báo lớp hình chữ nhật
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String color = sc.next();
        
        Rectange r = new Rectange(w,h,color);
        if (r.getWidth()>0&& r.getHeight()>0){
            System.out.printf("%.0f %.0f %s",r.findPerimeter() , r.findArea(), r.getColor());
        }
        else{
           System.out.print("INVALID");
        }
        
    }
}

// 10 2 RED
