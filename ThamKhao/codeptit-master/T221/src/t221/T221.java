/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t221;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class T221 {

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
            for(int i = 1;i<=n;i++){
                System.out.print(Integer.toBinaryString(i)+" ");
            }
            System.out.println("\n");
        }
    }
    
}
