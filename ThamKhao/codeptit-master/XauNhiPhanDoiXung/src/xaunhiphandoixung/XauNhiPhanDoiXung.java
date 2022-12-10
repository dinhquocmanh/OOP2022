/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xaunhiphandoixung;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class XauNhiPhanDoiXung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String();
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int L,R;
            L = sc.nextInt();
            R = sc.nextInt();
            int flag = 1;
            for(int j = 0;j<((R-L)+1) / 2;j++){
                if(s.charAt(L+j - 1) != s.charAt(R-j-1)){
                    flag = 0;
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
