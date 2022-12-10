/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j01004;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J01004 {
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t;
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            int a = sc.nextInt();
            if(isPrime(a) == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    
    public static int isPrime(int n){
        //flag = 0 => không phải số nguyên tố
        //flag = 1 => số nguyên tố

        int flag = 1;

        if (n <2) return flag = 0; /*Số nhỏ hơn 2 không phải số nguyên tố => trả về 0*/

        /*Sử dụng vòng lặp while để kiểm tra có tồn tại ước số nào khác không*/
        int i = 2;
        while(i <n){
            if( n%i==0 ) {
                flag = 0;
                break; /*Chỉ cần tìm thấy 1 ước số là đủ và thoát vòng lặp*/
            }
            i++;
        }

        return flag;
    }
    
}
