/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02004;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J02004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc = 0; tc <t ;tc++){
            //int n;
            //int a[] = new int[505];
            //n = sc.nextInt();
            String s = new String();
            s = sc.next();
            int n = s.length();
            int flag = 1;
            for(int i = 0 ; i< n/2;i++){
                int val = Character.getNumericValue(s.charAt(i));
                if(s.charAt(i) != s.charAt(n-i-1) || val % 2 == 1){
                    flag = 0;
                    break;
                }
            }
            if(flag == 0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
    
}
