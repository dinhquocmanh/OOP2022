
package oop;
import java.util.*;

class MatHang1{
    private String mamathang, tenmathang, donvitinh;
    private int giamua, giaban;

    public MatHang1(String mamathang, String tenmathang, String donvitinh, int giamua, int giaban) {
        this.mamathang = mamathang;
        this.tenmathang = tenmathang;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }
    
    public int tinhLoiNhuan(){
        return this.giaban-this.giamua;
    }
    
    public int compareTo(MatHang1 mh){
        return Integer.compare(this.tinhLoiNhuan(), mh.tinhLoiNhuan());
    }
    
    public String toString(){
        return String.format("%s %s %s %d %d %d",
                this.mamathang ,
            this.tenmathang,
            this.donvitinh ,
            this.giamua ,
            this.giaban,
            this.tinhLoiNhuan());
    }
    
}
public class J05081 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang1> listMH = new ArrayList<>();
        
        for (int i = 1; i <= m; i++) {
            String mamathang = String.format("MH%03d",i);
            //System.out.println(mamathang);
            MatHang1 mh = new MatHang1(mamathang, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            listMH.add(mh);
        }
        
        // sort
        Collections.sort(listMH, (mh1,mh2)-> {return mh2.compareTo(mh1);} );
        
        // print out
        for(MatHang1 mh : listMH){
            System.out.println(mh);
        }
    }
}

/*
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
*/