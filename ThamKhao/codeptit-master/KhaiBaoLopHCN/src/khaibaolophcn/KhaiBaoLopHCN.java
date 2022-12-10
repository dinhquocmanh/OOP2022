/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khaibaolophcn;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
class Rectangle{
    private double w,h;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double w, double h, String color) {
        this.w = w;
        this.h = h;
        this.color = color;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area(){
        return this.w * this.h;
    }
    public double chuVi(){
        return 2*(this.w+this.h);
    }

    @Override
    public String toString() {
        DecimalFormat dm = new DecimalFormat("0.#");
        return dm.format(chuVi()) + " " + dm.format(area()) + " " + color.substring(0,1).toUpperCase() + color.substring(1).toLowerCase();
    }
    
}
public class KhaiBaoLopHCN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        r.setW(sc.nextDouble());
        r.setH(sc.nextDouble());
        r.setColor(sc.next());
        if(r.getW() <= 0 || r.getH() <= 0) System.out.println("INVALID");
        else System.out.println(r);
    }
    
}
