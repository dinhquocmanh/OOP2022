
package oop;
import java.util.*;

class HocSinh{
    private int mahocsinh;
    private String hovaten;
    private float d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;

    public HocSinh(int mahocsinh, String hovaten, float d1, float d2, float d3, float d4, float d5, float d6, float d7, float d8, float d9, float d10) {
        this.mahocsinh = mahocsinh;
        this.hovaten = hovaten;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        this.d5 = d5;
        this.d6 = d6;
        this.d7 = d7;
        this.d8 = d8;
        this.d9 = d9;
        this.d10 = d10;
    }
    
    public float tinhDiemTrungBinh(){
        float tb = (d1*2+d2*2+d3+d4+d5+d6+d7+d8+d9+d10)/12;
        return tb;
    }
    
    public int compareTo(HocSinh hs){
        int compare = Float.compare(this.tinhDiemTrungBinh(), hs.tinhDiemTrungBinh());
        if (compare != 0) return compare;
        else {
            return Integer.compare(hs.mahocsinh, this.mahocsinh);
        }
    }
    
    public String toString(){
        String xeploai="";
        if(this.tinhDiemTrungBinh()<10) xeploai = "XUAT SAC";
        if(this.tinhDiemTrungBinh()<9) xeploai = "GIOI";
        if(this.tinhDiemTrungBinh()<8) xeploai = "KHA";
        if(this.tinhDiemTrungBinh()<7) xeploai = "TB";
        if(this.tinhDiemTrungBinh()<5) xeploai = "YEU";

        return String.format("HS%02d %s %.1f %s", this.mahocsinh, this.hovaten, this.tinhDiemTrungBinh(), xeploai);
    }
    
    
}
public class J05018 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        
        ArrayList<HocSinh> ListHS = new ArrayList<>();
        
        // read
        for (int i = 1; i <= t; i++) {
            HocSinh hs = new HocSinh(
                i,
                sc.nextLine(),
                sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat()
            );
            sc.nextLine();
            ListHS.add(hs);
        }
        
        // sort
        Collections.sort(ListHS, (hs1,hs2) -> {return hs2.compareTo(hs1);});
        
        //print out
        for(HocSinh hs : ListHS){
            System.out.println(hs);
        }
    }
}

/*
4
Luu Thuy Nhi
9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
Le Van Tam
8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
Nguyen Thai Binh
9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0

*/