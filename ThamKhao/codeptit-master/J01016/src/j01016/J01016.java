/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01016;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J01016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int cnt4 = 0;
        int cnt7= 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '4'){
                cnt4++;
            }
            if(s.charAt(i) == '7'){
                cnt7++;
            }
        }
        int cnt = cnt4 + cnt7;
        if(cnt == 4 || cnt == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}
