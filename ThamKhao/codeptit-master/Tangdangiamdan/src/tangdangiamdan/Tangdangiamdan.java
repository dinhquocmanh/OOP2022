/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tangdangiamdan;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class Tangdangiamdan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[1005];
        int t;
        int n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            n = sc.nextInt();
            int max = 0;
            for(int i=0;i<1001;i++){
                arr[i] = 0;
            }
            for(int i=0;i<n;i++){
                int a;
                a = sc.nextInt();
                arr[a] = 1;
                if(a > max) max = a;
            }
            for(int i=0;i<=max;i++){
                if(arr[i] == 1 && i%2 == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
            for(int i=max;i>=0;i--){
                if(arr[i] == 1 && i%2 == 1){
                    System.out.print(i + " ");
                }
            }
            System.out.print("\n");
        }
    }
    
}
