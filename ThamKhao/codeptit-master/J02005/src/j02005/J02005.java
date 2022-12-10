/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j02005;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J02005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M,N;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        int arr1[] = new int[105];
        int arr2[] = new int[105];
        int arr3[] = new int[105];
        int res[] = new int[105];
        for(int i=0;i<M;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            arr2[i] = sc.nextInt();
        }
        int cnt = 0;
        Arrays.sort(arr1);
        for(int i=0;i<M;i++){
            if(i>0 && arr1[i] != arr1[i-1] ){
                for(int j=0;j<N;j++){
                    if(arr1[i] == arr2[j]){
                        res[cnt] = arr1[i];
                        cnt++;
                        //break;
                    }
                }
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.print(res[i] + " ");
        }
        System.out.print("\n");
    }
    
}
