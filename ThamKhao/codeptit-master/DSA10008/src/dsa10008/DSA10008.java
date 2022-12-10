/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa10008;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA10008 {
    static Scanner sc = new Scanner(System.in);
    static int map[][] = new int[1005][1005];
    static int vs[][] = new int[1005][1005];
    static int N,M,S; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            N = sc.nextInt();
            M = sc.nextInt();
            S = sc.nextInt();
            for(int i=0;i<M;i++){
                int a,b,val;
                a = sc.nextInt();
                b = sc.nextInt();
                val = sc.nextInt();
                map[a][b] = val;
            }
        }
    }
    public static void dijktra(int n){
        
    }
}
