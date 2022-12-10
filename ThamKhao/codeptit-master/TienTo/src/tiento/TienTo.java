/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiento;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author thedung
 */
public class TienTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t --> 0){
            int n= Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] bt = s.split(" ");
            Stack<Long> st = new Stack<>();
            for(int i = 0;i< bt.length;i++){
                if(bt[i].equals("")) continue;
                if(bt[i].equals("+") || bt[i].equals("-") || bt[i].equals("*") || bt[i].equals("/")){
                    long a = st.pop();
                    long b = st.pop();
                    long c;
                    switch(bt[i]){
                        case "+":c = a+b; break;
                        case "-": c = b-a;break;
                        case "*": c= a*b;break;
                        default: c=b/a;break;
                    }
                    st.push(c);
                    
                }
                else st.push(Long.parseLong(bt[i]));
            }
            System.out.println(st.peek());
        }
    }
    
}
