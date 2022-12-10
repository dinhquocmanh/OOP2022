/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j03038;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J03038 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String();
        int vs[] = new int[105];
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        
        for(int i=0;i<s.length();i++){
            vs[i] = 0;
        }
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(vs[i] == 0){
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j) == s.charAt(i)){
                        vs[j] = 1;
                    }
                }
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    
}
