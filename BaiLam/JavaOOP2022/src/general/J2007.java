/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import java.util.*;
/**
 *
 * @author dmanh
 */


public class J2007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
           
            System.out.println("Test " + (test+1) + ":");
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] f = new int[100005];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                f[a[i]] ++;
            }
            for (int i : a) {
                if (f[i]>0) {
                    System.out.println(i + " xuat hien " + f[i] + " lan");
                    f[i]=0;
                }   
            }
        }
    }
    
    public static boolean kiemtrasnt(int a){
        if (a<2) return false;
        for(int i=2;i<Math.sqrt(a);i++){
            if (a%i==0) return false;
        }
        return true;
    }
    
   
}
