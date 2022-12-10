/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01011;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J01011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            BigInteger a;
            a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger ucln = UCLN(a,b);
            BigInteger temp = a.multiply(b);
            BigInteger bcnn = temp.divide(ucln);
            System.out.println(bcnn + " " + ucln);
        }
    }
    public static BigInteger UCLN(BigInteger a, BigInteger b){
        while (a != b) {
            if(a.compareTo(b) == 1){
                a = a.subtract(b);
            }
            else if(a.compareTo(b) == -1) {
                b = b.subtract(a);
            }
        }
        return a;
    }
}
