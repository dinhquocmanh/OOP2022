/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn26;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN26 {
    static int vs[] = new int[105];
    static int n,k,s;
    static int cnt;
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            n = sc.nextInt();
            k = sc.nextInt();
            s = sc.nextInt();
            if(n == 0 && k ==0 && s==0){
                break;
            }
            else{
                cnt =0;
                BT(0,0,1);
                System.out.println(cnt);
            }
        }
    }
    
    public static void BT(int limit,int tong, int curr){
        if(limit >= k){
            if(tong == s) cnt++;
            return;
        }
        if(tong > s ){
            return;
        }
        if(curr > n) return;
        for(int i=1;i<=2;i++){
            if(i == 1){
                BT(limit + 1,tong + curr, curr + 1); 
            }
            else{
                BT(limit,tong,curr+1);
            }
        }
    }
}
