/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn08;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        String str = new String();
        for(int tc = 0;tc<t;tc++){
            str = sc.next();
            char c[] = str.toCharArray();
            for(int i = str.length() - 1;i>=0;i--){
                if(c[i] == '0'){
                    c[i] = '1';
                    for(int j=i+1;j<str.length();j++){
                        c[j] = '0';
                    }
                    break;
                }
            }
            for(int i=0;i<str.length();i++){
                System.out.print(c[i]);
            }
            System.out.print("\n");
        }
    }
    
}
