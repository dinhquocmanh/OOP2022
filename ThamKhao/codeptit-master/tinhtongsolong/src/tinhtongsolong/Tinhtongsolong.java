/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tinhtongsolong;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class Tinhtongsolong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext()){
            String s = sc.next();
            try{
                long n = Long.parseLong(s);
                if(n>Integer.MAX_VALUE)
                    res += n;
            }
            catch(NumberFormatException e){
                continue;
            }
        }
        System.out.println(res);
    }
    
}
