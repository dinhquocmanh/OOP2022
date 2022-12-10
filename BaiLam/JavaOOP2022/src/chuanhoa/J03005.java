
package chuanhoa;
import java.util.*;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            // read
            String text = sc.nextLine();
            
            //chuan hoa
            text = text.trim(); // loai bo khoang trang dau cuoi
            text = text.toLowerCase(); // lowercase
            text = text.replaceAll("\\s+", " ");
            
            // capital first letter
            String[] temp = text.split(" ");
            String result = "";
            String ho = temp[0].toUpperCase();
            for (int i = 1; i < temp.length; i++) {
                String word = temp[i];
                result += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1); 
                if(i<temp.length-1) result += " ";
            }
            result += ", "+ho;
            
            // printout
            System.out.println(result);
        }
    }
}

/*
4
    nGUYEn    quaNG   vInH  
   tRan   thi THU    huOnG
   nGO   quoC  VINH
 lE            tuAn    aNH
*/