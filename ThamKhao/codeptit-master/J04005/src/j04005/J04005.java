/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04005;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J04005 {
    private static String name = new String();
    private static String date = new String();
    private static float score1;
    private static float score2;
    private static float score3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        date = sc.nextLine();
        score1 = sc.nextFloat();
        score2 = sc.nextFloat();
        score3 = sc.nextFloat();
        System.out.print(name + " " +date+" "+ (score1 + score2 + score3));
    }
    
    
}
