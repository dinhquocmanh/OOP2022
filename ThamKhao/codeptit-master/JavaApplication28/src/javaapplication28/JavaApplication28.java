/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication28;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int a[][] = new int[100005][2];
        for(int i=0;i<t;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = 0;
        }
        int flag = 1;
        while(flag == 1){
            flag = 0;
            for(int i=0;i<t-1;i++){
                if(a[i][1] == 0){
                    for(int j=i+1;j<t;j++){
                        if(a[j][1] == 0){
                            if((a[i][0] + a[j][0]) % 2 == 0){
                                a[i][1] = 1;
                                a[j][1] = 1;
                                flag = 1;
                            }
                            break;
                        }
                    }
                }
            }
        }
        int cnt = 0;
        for(int i =0;i<t;i++){
            if(a[i][1] == 0) cnt++;
        }
        System.out.println(cnt);
    }
    
}
