/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn01019;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN01019 {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int res[] = new int[15];
    static int vs[] = new int[15];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tc;
        tc = sc.nextInt();
        for(int m=0;m<tc;m++){
            // TODO code application logic here
            int t;
            t = sc.nextInt();
            for(int i=0;i<=t;i++){
                vs[i] = -1;
                res[i] = -1;
            }
            BT(t,1);
        }
    }
    
    public static void BT(int k,int step){
        if(step > k){
           for(int i=1;i<=k;i++){
               System.out.print(res[i]);
           }
           System.out.print("\n");
           return;
        }
        for(int i=k;i>=1;i--){
            if(vs[i] == -1 && i!=res[step-1]+1 && i != res[step-1]-1 ){
                vs[i] = 1;
                res[step] = i;
                BT(k,step+1);
                vs[i] = -1;
                res[step] = -1;
            } 
        }
    }
}
