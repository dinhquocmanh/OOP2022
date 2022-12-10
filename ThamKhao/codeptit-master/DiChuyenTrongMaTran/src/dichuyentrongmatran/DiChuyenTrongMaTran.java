/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dichuyentrongmatran;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DiChuyenTrongMaTran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int map[][] = new int[510][510];
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                map[i][j] = sc.nextInt();
            }
        }
        for(int i=1;i<N;i++){
            map[0][i] += map[0][i-1];
        }
        for(int i=1;i<M;i++){
            map[i][0] += map[i-1][0];
            
        }
        for(int i=1;i<M;i++){
            for(int j=1;j<N;j++){
                int check = Integer.max(map[i][j]+map[i-1][j], map[i][j]+map[i][j-1]);
                map[i][j] = check;
            }
        }
        System.out.println(map[M-1][N-1]);
    }
    
}
