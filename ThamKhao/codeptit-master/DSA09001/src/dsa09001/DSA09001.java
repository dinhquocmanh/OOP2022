/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa09001;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA09001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int map[][] = new int[1005][1005];
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i=0;i<E;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
            for(int i=1;i<=V;i++){
                System.out.print(i+": ");
                for(int j=1;j<=V;j++){
                    if(map[i][j] == 1) System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
    
}
