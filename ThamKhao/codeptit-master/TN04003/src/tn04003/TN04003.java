/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn04003;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN04003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int n;
            n = sc.nextInt();
            int a[] = new int[100005];
            int cnt[] = new int[100005];
            int max = 0;
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                if(a[i] >= max){
                    max = a[i];
                    cnt[i] = i+1;
                }
                else{
                    int cntS = 0;
                    for(int j = i;j>=0;j--){
                        if(a[j] <= a[i]) cntS++; 
                        if(a[j] > a[i] ) break;
                    }
                    cnt[i] = cntS;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(cnt[i] +" ");
            }
            System.out.print("\n");
        }
    }
    
}
