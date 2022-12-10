/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn06003;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN06003 {
    static int N,M,X;
    static Scanner sc = new Scanner(System.in);
    static int map[][] = new int[305][305];
    static int vs[] = new int[305];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();
        for(int i=1;i<=N;i++){
            vs[i] = 0;
            for(int j=1;j<=N;j++){
                map[i][j] = 0;
            }
        }
        for(int i=0;i<M;i++){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        BFS(X);
        int flag = 0;
        for(int i=1;i<=N;i++){
            if(vs[i] == 0){
                flag = 1;
                System.out.println(i);
            }
        }
        if(flag == 0){
            System.out.println(0);
        }
    }
    public static void BFS(int k){
        int q[] = new int[100005];
        int front = 0;
        int rear = 0;
        q[rear] = k;
        rear++;
        vs[k] = 1;
        while(front < rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=N;i++){
                if(map[curr][i] == 1 && vs[i] == 0){
                    vs[i] = 1;
                    q[rear] = i;
                    rear++;
                }
            }
        }
    }
}
