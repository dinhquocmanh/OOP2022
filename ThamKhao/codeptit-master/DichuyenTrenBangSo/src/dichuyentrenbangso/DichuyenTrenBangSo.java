/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dichuyentrenbangso;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DichuyenTrenBangSo {

    static int map[][] = new int[1005][1005];
    static int vs[] = new int[1005];
    static int M, N, S;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            M = sc.nextInt();
            N = sc.nextInt();
            S = sc.nextInt();

            for (int i = 1; i <= M; i++) {
                vs[i] = -1;
                for (int j = 1; j <= M; j++) {
                    map[i][j] = -1;
                }
            }
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                if(map[a][b] > c || map[a][b] == -1){
                    map[a][b] = c;
                    map[b][a] = c;
                }
                
            }
            Dijkstra(S);
            for (int i = 1; i <= M; i++) {
                System.out.print(vs[i] + " ");
            }
            System.out.println();
        }
    }

    public static void Dijkstra(int k) {
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = k;
        vs[k] = 0;
        rear++;
        while (front < rear) {
            int curr = q[front];
            front++;
            for (int i = 1; i <= M; i++) {
                if (map[curr][i] != -1) {
                    if (vs[i] == -1 || vs[curr] + map[curr][i] < vs[i]) {
                        vs[i] = vs[curr] + map[curr][i];
                        q[rear] = i;
                        rear++;
                    }
                }
            }
        }
    }
}
