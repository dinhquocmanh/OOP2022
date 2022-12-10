/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duongdi_1;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DuongDi_1 {
    static int map[][] = new int[1005][1005];
    static int vs[] = new int[1005];
    static int N,M,S,F;
    
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
            F = sc.nextInt();
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
            int res[] = new int[1005];
            int cnt = 0;
            
            if(vs[F] == -1){
                System.out.println(-1);
            }  
            else{
                int temp = F;
                while(temp != S){
                    res[cnt] = temp;
                    temp = vs[temp];
                    cnt++;
                }
                System.out.print(S + " ");
                for(int i=cnt-1;i>=0;i--){
                    System.out.print(res[i] + " ");
                }
                //System.out.print(F);
                System.out.print("\n");
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
