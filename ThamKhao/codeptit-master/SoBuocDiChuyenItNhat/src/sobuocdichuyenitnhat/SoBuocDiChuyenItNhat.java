/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobuocdichuyenitnhat;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class SoBuocDiChuyenItNhat {
    static Scanner sc = new Scanner(System.in);
    static int N,M;
    static int map[][] = new int[1005][1005];
    static int dirX[] = {0,1,1};
    static int dirY[] = {1,1,0};
    static int vs[][] = new int[1005][1005];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            N = sc.nextInt();
            M = sc.nextInt();
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    map[i][j] = sc.nextInt();
                    vs[i][j] = 0;
                }
            }
            vs[0][0] = 1;
            BFS();
            System.out.println(vs[N-1][M-1]-1);
        }
    }
    public static void BFS(){
        int front = 0;
        int rear = 0;
        int q[] = new int[1000005];
        q[rear] = 0;
        rear++;
        int HS = 10000;
        while(front < rear){
            int curr = q[front];
            front++;
            int currX = curr / HS;
            int currY = curr % HS;
            for(int i=0;i<3;i++){
                int val = 0;
                if(i == 0){
                    if(currY + 1 < M){
                        val = map[currX][currY] - map[currX][currY + 1];
                    }
                }
                if(i == 1){
                    if(currX + 1 < N && currY+1<M){
                        val = map[currX][currY] - map[currX + 1][currY + 1];
                    }
                }
                if(i == 2){
                    if(currX + 1< N){
                        val = map[currX][currY] - map[currX + 1][currY];
                    }
                }
                if(val < 0) val = val * -1;
                int nX = currX + val * dirX[i];
                int nY = currY + val * dirY[i];
                if(nX <N && nY<M && vs[nX][nY] == 0){
                    vs[nX][nY] = vs[currX][currY] + 1;
                    q[rear] = nX * HS + nY;
                    rear++;
                }
            }
        }
    }
}
