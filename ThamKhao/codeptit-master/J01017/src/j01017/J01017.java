/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01017;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J01017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            String s = new String();
            int flag = 1;
            s = sc.next();
            int tong = 0;
            for(int i=0;i<s.length();i++){
                int a = Character.getNumericValue(s.charAt(i));
                tong += a;
            }
            if(tong % 10 != 0 ) flag = 0;
            if(flag == 1){
                for(int i=0;i<s.length() - 1;i++){
                    int a = Character.getNumericValue(s.charAt(i));
                    int b = Character.getNumericValue(s.charAt(i+1));
                    if(a - b != 2 && b - a != 2){
                        flag = 0;
                        break;
                    }
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
