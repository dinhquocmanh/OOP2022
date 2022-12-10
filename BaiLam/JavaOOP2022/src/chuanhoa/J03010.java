
package chuanhoa;
import java.util.*;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        ArrayList<String> ListEmail = new ArrayList<>();
        
        while(t-->0){
            // read
            String text = sc.nextLine();
            // lower 
            text = text.toLowerCase();
            // loai bo khoang trang hai dau
            text = text.trim();
            // loai bo khoang trang thua
            text = text.replaceAll("\\s+", " ");
            // tao email
            String[] temp = text.split(" ");
            String lastname = temp[temp.length-1];
            String email = lastname;
            for (int i = 0; i < temp.length-1; i++) {
                email += temp[i].charAt(0);
            }
            // them so thu tu
            int count = 1;
            for(String e: ListEmail){
                if (email.equals(e)){
                    count ++;
                }
            }
            if (count!=1) email = email + String.valueOf(count);
            ListEmail.add(email);
            
        }
        
        // print out 
        for(String email: ListEmail){
            System.out.println(email+"@ptit.edu.vn");
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