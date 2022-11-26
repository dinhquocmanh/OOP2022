/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;
import java.util.*;
/**
 *
 * @author dmanh
 */
public class JavaOOP2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-->0){
            int[] a = new int[100];
            int n = sc.nextInt();
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            
            int doixung=1;
            for(int i=0;i<n/2;i++){
                if(a[i]!= a[n-i-1]) doixung=0;
            }
            if (doixung==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
    
}

/**
test:
2
4
1 4 4 1
5
1 5 5 5 3
 */