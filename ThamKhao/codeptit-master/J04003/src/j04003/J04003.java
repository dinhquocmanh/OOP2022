/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04003;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J04003 {

    /**
     * @param args the command line arguments
     */
    private static long tuSo;
    private static long mauSo;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        tuSo = sc.nextLong();
        mauSo = sc.nextLong();
        long uoc = gcd(tuSo,mauSo);
        System.out.println(tuSo/uoc + "/" + mauSo/uoc);
    }
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
