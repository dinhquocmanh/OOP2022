/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class J04006 {
    public static String name = new String();
    public static String MSV = new String();
    public static String lop = new String();
    public static String date = new String();
    public static float GPA;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        MSV = "B20DCCN001";
        name = sc.nextLine();
        lop = sc.nextLine();
        date = sc.nextLine();
        Date dateF = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateF = formatter.(date);
        } catch (ParseException e) {
        }
        GPA = sc.nextFloat();
        System.out.format(MSV + " " + name + " " + lop + " "+ dateF+" "+"%.2f",GPA);
        
        System.out.print("\n");
    }
    
}
