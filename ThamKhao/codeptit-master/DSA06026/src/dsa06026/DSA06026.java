/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa06026;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA06026 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int arr[] = new int[1005];
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            int flag =0;
            for(int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            for(int j=0;j<N-1;j++){
                if(arr[j]>arr[j+1]){
                    flag = 1;
                }
            }
            
            System.out.print("Buoc "+(i+1)+": ");
            for(int k=0;k<N;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println("\n");
            if(flag == 0) break;
        }
    }
    
}
