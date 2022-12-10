/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solocphatdoixungchan;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class SoLocPhatDoiXungChan {
    static int N;
    static int res[] = new int[10005];
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            N = sc.nextInt();
            BT(0,1);
            System.out.print("\n");
        }
    }
    public static void BT(int cnt,int step){
        if(cnt>=N){
            return;
        }
        for(int i=0;i<2;i++){
            if(i==0){
                res[step] = 6;
                for(int j=1;j<=step;j++){
                    res[step+j] = res[step-j+1];
                }
                for(int j=1;j<=step*2;j++){
                    System.out.print(res[j]);
                }
                System.out.print(" ");
                BT(cnt+1,step+1);
            }
            else{
                res[step] = 8;
                for(int j=1;j<=step;j++){
                    res[step+j] = res[step-j+1];
                }
                for(int j=1;j<=step*2;j++){
                    System.out.print(res[j]);
                }
                System.out.print(" ");
                BT(cnt+1,step+1);
            }
        }
    }
}
