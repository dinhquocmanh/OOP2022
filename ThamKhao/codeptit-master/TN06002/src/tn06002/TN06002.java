/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tn06002;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TN06002 {

    /**
     * @param args the command line arguments
     */
    static int map[][] = new int[20005][20005];
    static int vs[] = new int[20005];
    static int N,M;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        for(int i=1;i<=N;i++){
            vs[i] = 0;
        }
        for(int i = 0;i<M;i++){
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            map[a][b] = 1;
            map[b][a] = 1;
        }
        for(int i=1;i<=N;i++){
            int vung = 0;
            for(int k=1;k<=N;k++){
                vs[k] = 0;
            }
            for(int j = 1;j<=N;j++){
                if(vs[j]==0 && j!=i){
                    vung++;
                    BFS(i,j);
                }
            }
            System.out.print(vung+"\n");
        }
    }
    static void BFS(int k, int start){
        int front =0;
        int rear = 0;
        int q[] = new int[100005];
        vs[start] = 1;
        q[rear] = start;
        rear++;
        while(front<rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=N;i++){
                if(map[curr][i] == 1 && vs[i] == 0 && i != k){
                    q[rear] = i;
                    rear++;
                    vs[i] = 1;
                }
            }
        }
    }
}
