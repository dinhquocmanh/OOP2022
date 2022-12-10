/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j05081;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J05081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ma = 1;
        String name = new String();
        String donVi = new String();
        int giaMua;
        int giaBan;
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int tc = 0;tc<t;tc++){
            name = sc.nextLine();
            donVi = sc.nextLine();
            giaMua = sc.nextInt();
            giaBan = sc.nextInt();
            int ln = giaBan - giaMua;
            if(ma<10){
                System.out.println("MH00" + ma +" " +name+" " + donVi +" "+giaMua+" "+ giaBan +" "+ln);
            }
            else{
                System.out.println("MH0" + ma +" " +name+" " + donVi +" "+giaMua+" "+ giaBan +" "+ln);
            }
            ma++;
        }
    }
    
}
