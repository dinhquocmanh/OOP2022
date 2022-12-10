/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luyentaplap.trinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int bai,sub;

    public SinhVien(String name, int bai, int sub) {
        this.name = name;
        this.bai = bai;
        this.sub = sub;
    }

    @Override
    public String toString() {
        return name+" " + bai+" "+sub;
    }
    

    @Override
    public int compareTo(SinhVien o) {
        if(this.bai>o.bai) return -1;
        if(this.bai<o.bai) return 1;
        else{
            if(this.sub>o.sub) return 1;
            if(this.sub<o.sub) return -1;
            else{
                  return this.name.compareTo(o.name);
            }
        }
    }
        
}
public class LuyentaplapTrinh {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        ArrayList<SinhVien> li = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String s[] = sc.nextLine().split(" ");
            int bai = Integer.parseInt(s[0]);
            int sub = Integer.parseInt(s[1]);
            SinhVien sv = new SinhVien(name,bai,sub);
            li.add(sv);
        }
        Collections.sort(li);
        for(SinhVien x: li){
            System.out.println(x);
        }
    }
    
}
