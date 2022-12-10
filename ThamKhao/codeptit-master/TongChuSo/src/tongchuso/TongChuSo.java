/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tongchuso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class TongChuSo extends Number {
    private static String s = new String();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        InputStream in = new FileInputStream("DATA.in");
        
        
        Scanner sc = new Scanner(System.in);
        while(true){
            s = sc.nextLine();
            Number num = new Number(s);
            int tong = num.tinhTong(s);
            System.out.println(num.tong);
        }
    }
    
}
