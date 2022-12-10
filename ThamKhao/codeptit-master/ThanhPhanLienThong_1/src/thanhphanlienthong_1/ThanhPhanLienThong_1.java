/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thanhphanlienthong_1;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class ThanhPhanLienThong_1 {

    static int N, M;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            N = sc.nextInt();
            M = sc.nextInt();
            //X = sc.nextInt();

            int map[][] = new int[1005][1005];
            int vs[] = new int[1005];
            //vs[X] = 1;
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
            int cntroot = 0;
            for (int i = 1; i <= N; i++) {
                if (vs[i] == 0) {
                    BFS(map, vs, i, 0);
                    cntroot++;
                }
            }
            //int cnt = 0;
            for (int j = 1; j <= N; j++) {
                int cnt = 0;
                for (int i = 1; i <= N; i++) {
                    vs[i] = 0;
                }
                for (int i = 1; i <= N; i++) {
                    if (vs[i] == 0 && i != j) {
                        BFS(map, vs, i, j);
                        cnt++;
                    }
                }
                if (cnt > cntroot) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void BFS(int map[][], int vs[], int X, int avoid) {
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = X;
        vs[X] = 1;
        rear++;
        while (front < rear) {
            int curr = q[front];
            front++;
            for (int i = 1; i <= N; i++) {
                if (map[curr][i] == 1 && vs[i] == 0 && i != avoid) {
                    vs[i] = 1;
                    q[rear] = i;
                    rear++;
                }
            }
        }
    }
}
