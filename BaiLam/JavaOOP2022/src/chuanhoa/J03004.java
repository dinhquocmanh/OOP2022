
package chuanhoa;
import java.util.*;

public class J03004 {
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
            String result = "";
            String[] temp = text.split(" ");
            for (int i = 0; i < temp.length; i++) {
                String word = temp[i];
                result += String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1); 
                result += " ";
            }
            // printout
            System.out.println(result);
        }
    }
}

/*
3
   nGuYEN    vAN    naM
tRan           TRUNG hiEU
      vO le         hOA bINh
*/