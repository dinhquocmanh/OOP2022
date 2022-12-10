/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t224;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class T224 {
    static int res[] = new int[500];
    static int num[] = new int[500];
    static int n;
    
    static int minstep = 400;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            n = sc.nextInt();
            res[0] = 9;
            int du = 9 % n;
            
            minstep = 400;
            BT(du,1);
            for(int i=0;i<minstep;i++){
                System.out.print(num[i]);
            }
            System.out.print("\n");
        }
    }
    public static void BT(int du,int step ){
        
        
        if(du == 0){
            if(step<minstep){
                minstep = step;
                for(int i=0;i<step;i++){
                    num[i] = res[i];
                }
            }
            
            return;
        }
        if(step > minstep) return;
        //if(flag == 1) return;
        for(int i=0;i<2;i++){
            if(i==0){
                res[step] = 0;
                
                BT((du * 10) % n,step+1);
            }
            else{
                res[step] = 9;
                
                BT(((du * 10) + 9) % n,step+1);
            }
            
        }
    }
    
}
