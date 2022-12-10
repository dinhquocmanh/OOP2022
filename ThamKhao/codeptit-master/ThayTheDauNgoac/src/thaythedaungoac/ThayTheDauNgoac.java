/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thaythedaungoac;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author thedung
 */
public class ThayTheDauNgoac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int tc=0;tc<t;tc++){
            String s = sc.next();
            ArrayList<String> li = new ArrayList<>();
            Stack<Character> st = new Stack<>();
            int len = s.length();
            Boolean[] check = new Boolean[len];
            for(int i=0;i<len;i++) check[i] = true;
            for(int i=0;i<len;i++){
                char c = s.charAt(i);
                if(c=='('){
                    st.add(c);
                    li.add("-1");
                }
                else if(c==')'){
                    if(!st.empty() && st.peek()=='('){
                        for(int j=i;j>=0;j--){
                            if(s.charAt(j) == '(' && check[j]){
                                li.set(j,"0");
                                check[j] = false;
                                break;
                            }
                        }
                        li.add("1");
                        st.pop();
                    }
                    else if(st.empty()||st.peek() == '(') li.add("-1");
                }
                else li.add(c+"");
            }
            for(int i=0;i<li.size();i++){
                System.out.print(li.get(i));
            }
            System.out.println();
        }
        
        
    }
    
}
