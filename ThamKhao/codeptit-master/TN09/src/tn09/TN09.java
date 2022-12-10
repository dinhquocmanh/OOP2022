/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn09;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN09 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            int n;
            n = sc.nextInt();
            int a[] = new int[1005];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            for(int i=n-2;i>=0;i--){
                if(a[i] < a[i+1]){
                    int min = a[i];
                    int minRemain = 1001;
                    int index = 0;
                    for(int j=i+1;j<=n-1;j++){
                        if(a[j] > min && a[j] < minRemain){
                            minRemain = a[j];
                            index = j;
                        }
                    }
                    int temp = a[i];
                    a[i] = a[index];
                    a[index] = temp;
                    int b[] = new int[1005];
                    
                }
            }
        }
    }
    
}
