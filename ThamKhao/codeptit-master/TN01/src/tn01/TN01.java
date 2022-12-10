/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn01;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN01 {
    static long arr[] = new long[100];
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            int n;
            n = sc.nextInt();
            arr[1] = 1;
            arr[2] = 1;
            System.out.println(Fibo(n));
        }
        
    }
    public static long Fibo(int k){
        if(k == 1 || k == 2) return arr[1];
        else{
            for(int i=3;i<=k;i++){
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr[k];
    }
}
