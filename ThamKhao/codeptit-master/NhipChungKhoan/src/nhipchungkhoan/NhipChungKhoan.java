/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nhipchungkhoan;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class NhipChungKhoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        int n;
        int a[] = new int[100005];
        int res[] = new int[100005];
        for(int tc = 0;tc<t;tc++){
            n = sc.nextInt();
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
                res[i] = 1;
            }
            for(int i=1;i<n;i++){
                for(int j=i-1;j>=0;j--){
                    if(a[j]<=a[i]) res[i]++;
                    else break;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
