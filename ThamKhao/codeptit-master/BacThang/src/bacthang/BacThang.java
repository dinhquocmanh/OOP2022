/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacthang;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class BacThang {
    static int cnt = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            cnt = 0;
            int bac = sc.nextInt();
            int buoc = sc.nextInt();
            BT(bac,buoc,bac);
            System.out.println(cnt);
        }
    }
    public static void BT(int bac, int buoc,int remain){
        if(remain <= 0){
            cnt++;
            return;
        }
        for(int i=1;i<=buoc;i++){
            if(i<=remain){
                BT(bac,buoc,remain - i);
            }
        }
    }
}
