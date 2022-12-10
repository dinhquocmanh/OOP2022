/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiemtrachiahet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class Kiemtrachiahet {
    //xsstatic int num[] = new int[100005];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SONGUYEN.IN"));
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            String s = sc.next();
            int div7 = (s.charAt(0) - '0') % 7;
            int div13 = (s.charAt(0) - '0') % 13;
            for(int i=1;i<s.length();i++){
                div7 = (div7 * 10 + (s.charAt(i) - '0')) % 7;
                div13 = (div13 * 10 + (s.charAt(i) - '0')) % 13;
            }
            if(div7 == 0 && div13 != 0){
                System.out.println("Div 7");
            }
            else if(div7 != 0 && div13==0){
                System.out.println("Div 13");
            }
            else if(div7==0 && div13==0){
                System.out.println("Both");
            }
            else{
                System.out.println("None");
            }
        }
    }
    
}
