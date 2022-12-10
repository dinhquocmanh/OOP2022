/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn27;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s1 = new String();
        String s2 = new String();
        s1 = sc.next();
        s2 = sc.next();
        int res1 = 0;
        int res2 = 0;
        int res = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) == '6'){
                s1 = s1.replace('6', '5');
            }
        }
        res1 = turnToInt(s1);
        for(int i=0;i<s2.length();i++){
            s2 = s2.replace('6','5');
        }
        
        res2 = turnToInt(s2);
        res = res1 + res2;
        System.out.print(res + " ");
        for(int i=0;i<s1.length();i++){
            
            s1 = s1.replace('5', '6');
            
        }
        res1 = turnToInt(s1);
        for(int i=0;i<s2.length();i++){
            s2 = s2.replace('5','6');
        }
        
        res2 = turnToInt(s2);
        res = res1 + res2;
        System.out.print(res + "\n");
    }
    public static int turnToInt(String s){
        int res = 0;
        for(int i = 0;i<s.length();i++){
            res += Character.getNumericValue(s.charAt(i)) * pow10(s.length() - i - 1);
        }
        return res;
    }
    public static int pow10(int k){
        int res = 1;
        for(int i=0;i<k;i++){
            res *= 10;
        }
        return res;
    }
}
