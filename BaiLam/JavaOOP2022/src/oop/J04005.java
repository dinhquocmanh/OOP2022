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
class Student{
    private String hoten;
    private String date;
    private float diem1;
    private float diem2;
    private float diem3;

    public Student(String hoten, String date, float diem1, float diem2, float diem3) {
        this.hoten = hoten;
        this.date = date;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDate() {
        return date;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public float getTongDiem(){
        return this.diem1 + this.diem2 + this.diem3;
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoten= sc.nextLine();
        String ngaysinh = sc.next();
        float diem1=sc.nextFloat();
        float diem2=sc.nextFloat();
        float diem3=sc.nextFloat();
        
        Student s = new Student(hoten, ngaysinh, diem1, diem2, diem3);
        System.out.printf("%s %s %.1f", s.getHoten(), s.getDate(), s.getTongDiem());
    }
}

/*
Nguyen Hoang Ha
11/10/2001
4.5
10.0
5.5
*/