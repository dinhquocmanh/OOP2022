/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author thedung
 */
public class tienNuoc {
    private int soDau;
    private int soCuoi;

    public tienNuoc(int soDau, int soCuoi) {
        this.soDau = soDau;
        this.soCuoi = soCuoi;
    }

    public int getSoDau() {
        return soDau;
    }

    public void setSoDau(int soDau) {
        this.soDau = soDau;
    }

    public int getSoCuoi() {
        return soCuoi;
    }

    public void setSoCuoi(int soCuoi) {
        this.soCuoi = soCuoi;
    }
    
    public int tinhTien(){
        int tong;
        int soNuoc;
        tong = 0;
        soNuoc = soCuoi - soDau;
        if(soNuoc<=10){
            tong = soNuoc*5973;
        }
        if(soNuoc>10 && soNuoc<=20){
            tong = 10*5973 + (soNuoc-10)*7052;
        }
        if(soNuoc>20 && soNuoc<=30){
            tong = 10*5973 + 10*7052 +  (soNuoc-20)*8669;
        }
        if(soNuoc>30){
            tong = 10*5973 + 10*7052 + 10*8669 + (soNuoc-30)*15929;
        }
        return tong;
    }
    
}
