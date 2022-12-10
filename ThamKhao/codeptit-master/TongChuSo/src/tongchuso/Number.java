/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tongchuso;

/**
 *
 * @author thedung
 */
public class Number {
    public String s;
    public int tong;

    public Number(String s) {
        
        this.s = s;
    }

    public String getS() {
        for(int i=0;i<s.length();i++){
            
        }
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
    
    public static int tinhTong(String s){
        int tong = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'>0 && s.charAt(i)-'0'<10){
                tong += s.charAt(i) - '0';
            }
        }
        return tong;
    }
            
            
            
            
    
    
}
