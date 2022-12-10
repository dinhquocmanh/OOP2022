/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication34;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc =0 ;tc<t;tc++){
            String s = new String();
            s = sc.next();
            int p = Integer.parseInt(s,2);
            System.out.println(Integer.toBinaryString(p+1));
        }
    }
    
}
