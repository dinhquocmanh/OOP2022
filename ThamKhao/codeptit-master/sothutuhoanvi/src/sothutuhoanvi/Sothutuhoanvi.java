/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sothutuhoanvi;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class Sothutuhoanvi {
    static int n;
    static int vs[] = new int[15];
    static int res[] = new int[15];
    static int num[] = new int[15];
    static int stt = 1;
    static int found = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                num[i] = sc.nextInt();
                vs[i+1] = 0;
            }
            found = 0;
            stt = 1;
            BT(n,0);
        }
    }
    public static void BT(int k,int step){
        if(step>=k){
            int flag = 0;
            for(int i=0;i<k;i++){
                if(res[i] != num[i]){
                    flag = 1;
                }
            }
            if(flag == 1){
                stt++;
            }
            else{
                found = 1;
                System.out.println(stt);
            }
            return;
        }
        if(found == 1) return;
        for(int i=1;i<=k;i++){
            if(vs[i] == 0){
                vs[i] = 1;
                res[step] = i;
                BT(k,step+1);
                vs[i] = 0;
                //res[step] = 0;
            }
        }
    }
    
}
