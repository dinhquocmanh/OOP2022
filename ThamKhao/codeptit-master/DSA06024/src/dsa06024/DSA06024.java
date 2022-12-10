/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa06024;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DSA06024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        int arr[] = new int[1005];
        for(int i=0;i<t;i++){
            arr[i] = sc.nextInt();
        }
        int step = 1;
        for(int i=0;i<t-1;i++){
            int min = arr[i];
            int place = -1000;
            int flag = 0;
            for(int j=i+1;j<t;j++){
                if(arr[j] < min){
                    min = arr[j];
                    place = j;
                }
            }
            if(place != -1000){
                arr[place] = arr[i];
                arr[i] = min;
                flag = 1;
            }
            
                System.out.print("Buoc " + step + ": ");
                step++;
                for(int k=0;k<t;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.print("\n");
            
        }
    }
    
}
