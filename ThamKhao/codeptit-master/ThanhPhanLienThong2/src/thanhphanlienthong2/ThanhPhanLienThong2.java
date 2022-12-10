/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhphanlienthong2;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class ThanhPhanLienThong2 {

    static int map[][] = new int[150][150];
    static int vs[] = new int[150];
    static int res[] = new int[150];
    static int N,M;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            N = sc.nextInt();
            M = sc.nextInt();

            for(int i=1;i<=N;i++){
                vs[i] = 0;
                for(int j=1;j<=N;j++){
                    map[i][j] = 0;
                }
            }

            for(int i=0;i<M;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
            for(int i=1;i<=N;i++){
                for(int k=1;k<=N;k++){
                    vs[k] = 0;
                }
                int cnt = 0;
                for(int j=1;j<=N;j++){
                    if(vs[j] == 0 && j!=i){
                        cnt++;
                        BFS(j,i);
                    }
                }
                res[i] = cnt;
            }
            int max = 0;
            int dinh = 0;
            for(int i=1;i<=N;i++){
                if(res[i] > max){
                    max = res[i];
                    dinh = i;
                }
            }
            //System.
        }
        
    }
    public static void BFS(int start, int avoid){
        int front = 0;
        int rear = 0;
        int q[] = new int[400005];
        vs[start] = 1;
        q[rear] = start;
        rear++;
        while(front<rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=N;i++){
                if(map[curr][i] == 1 && vs[i] == 0 && i != avoid ){
                    vs[i] = 1;
                    q[rear] = i;
                    rear++;
                }
            }
        }
    }
}