
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import java.io.FileNotFoundException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class main {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) throws FileNotFoundException{
        File x = new File("D:\\java_netbean\\code_ptit\\Hello.txt");
    	  Scanner sc = new Scanner(x);
    	  String content = "";
    	  while(sc.hasNextLine()) {
    		  content += sc.nextLine()+"\r\n";
    	  }
  	      System.out.println(content);

    	  sc.close();
    	} 
    }

