/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa09019;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA09019 {
    static Scanner sc = new Scanner(System.in);
    static int M,N;
    static int map[][] = new int[1005][1005];
    static int vs[] = new int[1005];
    static int flag;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            flag = 0;

            M = sc.nextInt();
            N = sc.nextInt();
            for(int i = 0;i<N;i++){
                int a,b;
                a = sc.nextInt();
                b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
                vs[i] = -1;

            }
            for(int i=1;i<=M;i++){
                if(vs[i] == -1){
                    BFS(i);
                }
                if(flag == 1){
                    break;
                }
            }
            if(flag == 1){
                System.out.print("YES \n");
            }
            else{
                System.out.print("NO \n");
            }
        }
    }
    public static void BFS(int k){
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = k;
        vs[k] = 0;
        rear++;
        while(front<rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=M;i++){
                if(map[curr][i] == 1 && vs[i]==-1){
                    vs[i] = curr;
                    q[rear] = i;
                    rear++;
                }
                else if(map[curr][i] == 1 && vs[i]!=-1 && vs[i]!=curr){
                    flag = 1;
                    return;
                }
            }
        }
    }
}
