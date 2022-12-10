/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package khonglienthongvoidinh1;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class KhongLienThongVoiDinh1 {

    static int map[][] = new int[350][350];
    static int vs[] = new int[350];
    static int parent[] = new int[350];
    static int truyVan[][] = new int[25550][2];
    static int M, N, Q;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        M = sc.nextInt();
        N = sc.nextInt();
        Q = sc.nextInt();
        
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            map[a][b] = c;
        }
        for(int i=0;i<Q;i++){
            truyVan[i][0] = sc.nextInt();
            truyVan[i][1] = sc.nextInt();
            
        }
        for(int i=0;i<Q;i++){
            BFS(1,M);
            System.out.println(vs[truyVan[i][1]]);
        }

    }

    public static void BFS(int S,int F) {
        int front = 0;
        int rear = 0;
        int q[] = new int[100000005];
        //int HS = 10000;
        for(int i=1;i<=M;i++){
            vs[i] = -1;
            
        }
        q[rear] = S;
        vs[S] = 0;
        parent[S] = 0;
        rear++;
        while (front < rear) {
            int curr = q[front];
            //if(curr == F) break;
            front++;
            for (int i = 1; i <= M; i++) {
                if(map[curr][i] != 0){
                    if(vs[i] == -1){
                        if(vs[curr] < map[curr][i]){
                            vs[i] = map[curr][i];
                        }
                        else{
                            vs[i] = vs[curr];
                        }
                        q[rear] = i;
                        parent[i] = curr;
                        rear++;
                    }
                    
                    else{
                        if(curr != parent[i]){
                            int temp;
                            if(vs[curr] < map[curr][i]) temp = map[curr][i];
                            else temp = vs[curr];
                            if(vs[i] > temp) {
                                vs[i] = temp;
                                q[rear] = i;
                                parent[i] = curr;
                                rear++;
                            }
                        }
                    }

                }
            }

        }
    }

}
