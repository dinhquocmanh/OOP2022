/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duyetdothi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DuyetDoThi {
    static ArrayList<Integer> st[] = new ArrayList[1005];
    static int vs[] = new int[1005];
    static int N,M;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            N = sc.nextInt();
            M = sc.nextInt();
            //S = sc.nextInt();
            for(int i=1;i<=N;i++){
                st[i] = new ArrayList<>();
                vs[i] = 0;
            }
            for(int i=1;i<=M;i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                st[a].add(b);
                st[b].add(a);
            }
            int cnt = 0;
            for(int i=1;i<=N;i++){
                if(solution(i,N)) cnt++;
            }
            System.out.println(cnt);
            for(int i=1;i<= N;i++){
                if(solution(i,N)) System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void DFS(int start){
        //System.out.print(" "+start);
        vs[start] = 1;
        for(Integer j: st[start]){
            if(vs[j] == 0){
                DFS(j);
            }
        }
    }
    public static boolean check(int n){
        for(int i=1;i<=N;i++){
            if(vs[i] == 0) return false;
        }
        return true;
    }
    public static boolean solution(int start,int n){
        for(int i=1;i<=n;i++) vs[i] = 0;
        vs[start] = 1;
        if(start == 1) DFS(2);
        else DFS(1);
        if(!check(n)) return true;
        else return false;
    }
}
