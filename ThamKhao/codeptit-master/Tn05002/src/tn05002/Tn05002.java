/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn05002;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class Tn05002 {
    static Scanner sc = new Scanner(System.in);
    static int V,E,U;
    static int map[][] = new int[1005][1005];
    static int vs[] = new int[1005];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            V = sc.nextInt();
            E = sc.nextInt();
            U = sc.nextInt();
            for(int i=1;i<=V;i++){
                vs[i] = 0;
                for(int j=1;j<=V;j++){
                    map[i][j] = 0;
                }
            }
            for(int i=1;i<=E;i++){
                int a,b;
                a = sc.nextInt();
                b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
            System.out.print("BFS(" + U +") = ");
            BFS(U);
            System.out.print("\n");
        }
    }
    
    public static void BFS(int u){
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = u;
        rear++;
        vs[u] = 1;
        System.out.print(u);
        while(front < rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=V;i++){
                if(map[curr][i] == 1 && vs[i] == 0){
                    System.out.print(" -> " + i);
                    vs[i] = curr;
                    q[rear] = i;
                    rear++;
                }
            }
        }
    }
}
