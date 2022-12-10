/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa09003;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA09003 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int map[][] = new int[1005][1005];
        int dinh;
       
        for(int tc=0;tc<1;tc++){
            dinh = sc.nextInt();
            
            for(int i=0;i<dinh;i++){
                int a,b;
                a = sc.nextInt();
                b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
           
            for(int i=1;i<=dinh;i++){
                //System.out.print(i+": ");
                for(int j=1;j<=dinh;j++){
                    if(map[i][j]==1){
                        System.out.println(i+" "+j);
                        map[j][i]=0;
                    }
                     
                }
            }
        }
    }
    
}
