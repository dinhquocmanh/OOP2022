/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daysovohan;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class DaySoVoHan {
    static int n;
    static long res;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            n = sc.nextInt();
            Fibo(n,1,0,2);
            System.out.println(res);
        }
    }
    public static void Fibo(long k,long f1, long f2,long step){
        if(k == 0){
            res = 0;
            return;
        }
        if(k==1){
            res = 1;
            return;
        }
        if(step>k){
            res = f1;
            return ;
        }
        res = (f1+f2) ;
        if(res>1000000000+7) res = res % (1000000000+7);
        Fibo(k,res,f1,step+1);
    }
}
