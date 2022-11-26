/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class SinhVien{
    private String masv;
    private String hoten;
    private String lop;
    private String ngaysinh;
    private float gpa;

    public SinhVien(String masv, String hoten, String lop, String ngaysinh, float gpa) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.ngaysinh = ngaysinh;
        this.gpa = gpa;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public float getGpa() {
        return gpa;
    }
    
}

public class J04006 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String lop = sc.next();
        String ngaysinh = sc.next();
        float gpa = sc.nextFloat();
        String msv = "B20DCCN001";
        SinhVien sv = new SinhVien(msv, name, lop, ngaysinh, gpa);
        
        // convert date
        String pattern = "dd/mm/yyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(ngaysinh);
        ngaysinh = sdf.format(date);
        //System.out.println(date);
        
        System.out.printf("%s %s %s %s %.2f",msv, name, lop, ngaysinh, gpa);
    }
}

/*
Nguyen Hoa Binh
D20CQCN04-B
2/2/2002
2
*/