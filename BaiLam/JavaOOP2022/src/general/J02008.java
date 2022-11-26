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
public class J02008 {
    /**
     * Quy tắc tính: 
     * bội chung của n số đầu tiên bằng bội chung của số n với
     * bội chung của n-1 số trước đó
     * @param args 
     */
    
    
    public static long ucln(long a, long b){
        // ucnn
         if (b == 0)
            return a;
        return ucln(b, a % b);
    }
    

    public static long bcnn(long a, long b){
        return a*b/ucln(a,b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            
            long [] LCM = new long[45];
            LCM[1] = 1;
            LCM[2] = 2;
            for (int i = 3; i <= n; i++) {
                // LCM[i] = bcnn(LCM[i-1] , i)
                LCM[i] = bcnn(LCM[i-1],i);
            }
            System.out.println(LCM[n]);
        }
    }
}
