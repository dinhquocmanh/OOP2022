
package oop;
import java.util.*;

class HocSinh1{
    private String masinhvien, hoten, sodienthoai;
    private int sttnhom;

    public HocSinh1() {
    }

    public HocSinh1(String masinhvien, String hoten, String sodienthoai, int sttnhom) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.sodienthoai = sodienthoai;
        this.sttnhom = sttnhom;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",this.masinhvien,this.hoten,this.sodienthoai);
    }

    public int getSttnhom() {
        return sttnhom;
    }
   
    
}

class BaiTapLon{
    private String name;
    private int stt;

    public BaiTapLon(String name, int stt) {
        this.name = name;
        this.stt = stt;
    }

    @Override
    public String toString() {
        return String.format("Bai tap dang ky: %s",this.name);
    }

    public int getStt() {
        return stt;
    }
    
    
    
    
}

public class J06003 {
    public static void main(String[] args) {
        // read
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();int m=sc.nextInt();
        sc.nextLine();
        // read sinh vien
        ArrayList<HocSinh1> ListHS = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            HocSinh1 hs = new HocSinh1(sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            ListHS.add(hs);
        }
        // read baitap
        ArrayList<BaiTapLon> ListBTL = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            BaiTapLon btl = new BaiTapLon(sc.nextLine(), i+1);
            ListBTL.add(btl);
        }
        // so Q
        int q =Integer.parseInt(sc.nextLine());
        for (int i = 0; i < q; i++) {
            int sttnhom=Integer.parseInt(sc.nextLine());
            System.out.printf("DANH SACH NHOM %d:\n",sttnhom);
            for(HocSinh1 hs: ListHS){
                if (hs.getSttnhom()==sttnhom) System.out.println(hs);
            }
            for(BaiTapLon btl:ListBTL){
                if (btl.getStt()==sttnhom) System.out.println(btl);
            }
        }
    }
}

/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
*/