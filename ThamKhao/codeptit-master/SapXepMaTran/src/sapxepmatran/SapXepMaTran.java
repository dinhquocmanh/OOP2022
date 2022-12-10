/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sapxepmatran;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class SapXepMaTran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATIX.in"));
        int map[][] = new int[105][105];
        int t;
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            int N,M,I;
            N = sc.nextInt();
            M = sc.nextInt();
            I = sc.nextInt();
            for(int i = 1;i<=N;i++){
                for(int j=1;j<=M;j++){
                    map[i][j] = sc.nextInt();
                }
            }
            for(int i=1;i<=M;i++){
                if(map[i][I] < map)
            }
        }
    }
    
}
