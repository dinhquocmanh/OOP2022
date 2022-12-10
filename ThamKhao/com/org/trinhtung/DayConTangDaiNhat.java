package org.trinhtung;

import java.util.Scanner;
//6
//1 2 5 4 6 2

//4
public class DayConTangDaiNhat {
    public static void main(String[] arps){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        for(int i =0;i<n;i++) a[i] = in.nextInt();
        System.out.println(qhd(a,n));
    }
    public static int qhd(int a[], int n){
        int f[] = new int[n], i, j, kq=0;
        f[0] =1;
        for(i=1;i<n;i++){
            f[i] =1;
            for(j=0;j<i;j++){
                if(a[j]<a[i]){
                    f[i] = Math.max(f[i], f[j]+1);
                }
            }
            kq = Math.max(kq, f[j]);
        }
        return kq;
    }
    
}
