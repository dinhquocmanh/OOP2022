/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duongditrongmatran;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DuongDiTrongMaTran {
    static int map[][] = new int[1005][1005];
    static int vs[] = new int[1005];
    static int M,N,S;
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
            S = sc.nextInt();
            for(int i=1;i<=N;i++){
                vs[i] = -1;
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
            BFS();
            for(int i=1;i<=N;i++){
                if(i!=S){
                    int res[] = new int[1005];
                    int cnt = 0;
                    if(vs[i] == -1){
                        System.out.println("No path");
                    }
                    else{
                        int temp = i;
                        while(temp != S){
                            res[cnt] = temp;
                            temp = vs[temp];
                            cnt++;
                        }
                        System.out.print(S + " ");
                        for(int j=cnt-1;j>=0;j--){
                            System.out.print(res[j]+" ");
                        }
                        System.out.println();
                    }
                }
            }
        }
    }
    public static void BFS(){
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = S;
        vs[S] = 0;
        rear++;
        while(front<rear){
            int curr = q[front];
            front++;
            for(int i=1;i<=N;i++){
                if(map[curr][i] == 1 && vs[i] == -1){
                    vs[i] = curr;
                    q[rear] = i;
                    rear++;
                }
            }
        }
    }
}
