
package oop;
import java.util.*;
class KhachHang{
    private String makh;
    private String tenkh;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;

    public KhachHang(String makh, String tenkh, String gioitinh, String ngaysinh, String diachi) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getMakh() {
        return makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }
    
    
}

class MatHang{
    private String mamathang;
    private String tenmathang;
    private String donvitinh;
    private int giamua;
    private int giaban;

    public MatHang(String mamathang, String tenmathang, String donvitinh, int giamua, int giaban) {
        this.mamathang = mamathang;
        this.tenmathang = tenmathang;
        this.donvitinh = donvitinh;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMamathang() {
        return mamathang;
    }

    public String getTenmathang() {
        return tenmathang;
    }

    public String getDonvitinh() {
        return donvitinh;
    }

    public int getGiamua() {
        return giamua;
    }

    public int getGiaban() {
        return giaban;
    }
    
    
}

class HoaDon{
    private String mahoadon;
    private KhachHang khachhang;
    private MatHang mathang;
    private int soluong;

    public HoaDon(String mahoadon, KhachHang khachhang, MatHang mathang, int soluong) {
        this.mahoadon = mahoadon;
        this.khachhang = khachhang;
        this.mathang = mathang;
        this.soluong = soluong;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public MatHang getMathang() {
        return mathang;
    }

    public int getSoluong() {
        return soluong;
    }
    
    public String toString(){
        
        return String.format("%s %s %s %s %s %s %s %s %d",
                this.mahoadon,
                this.khachhang.getTenkh(),
                this.khachhang.getDiachi(),
                this.mathang.getTenmathang(),
                this.mathang.getDonvitinh(),
                this.mathang.getGiamua(),
                this.mathang.getGiaban(),
                this.soluong,
                this.mathang.getGiaban()*this.soluong
                );
    }
}

public class J06005 {
    
    static ArrayList<KhachHang> listKH = new  ArrayList<>();
    static ArrayList<MatHang> listMH = new ArrayList<>();
    
    static MatHang findMatHangByID(String id){
        for (int i = 0; i < listMH.size(); i++) {
            MatHang mh = listMH.get(i);
            //System.out.printf("Find mat hang id: %s compare to: %s %n", id, mh.getMamathang());
            if ( mh.getMamathang().equals(id)) return mh;
        }
        return listMH.get(0);
    }
    static KhachHang findKhachHangByID(String id){
        for (int i = 0; i < listKH.size(); i++) {
            KhachHang kh = listKH.get(i);
            if (kh.getMakh().equals(id)) return kh;
        }
        return listKH.get(0);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sokhachhang = Integer.parseInt(sc.nextLine());
        // Read Khach hang
        for (int i = 1; i <= sokhachhang; i++) {
            String makhachhang=String.format("KH%03d", i);
            KhachHang kh = new KhachHang(makhachhang, sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
            listKH.add(kh);
        }
        // Read Mat Hang
        int somathang = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= somathang; i++) {
            String mamathang=String.format("MH%03d", i);
            MatHang mh = new MatHang(mamathang, sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()),Integer.parseInt(sc.nextLine()));
            listMH.add(mh);
        }
        // read Hoa don
        int sohoadon = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= sohoadon; i++) {
            String mahoadon=String.format("HD%03d", i);
            String makhachhang = sc.next();
            String mamathang = sc.next();
            int soluong=sc.nextInt();
            MatHang mh = findMatHangByID(mamathang);
            KhachHang kh = findKhachHangByID(makhachhang);
            
            HoaDon hd = new HoaDon(mahoadon,kh, mh ,soluong);
           
            
            System.out.println (hd);
            //System.out.println("Length khach hang: "+listKH.size());
            //System.out.println("Length mat hang: "+listMH.size());
        }
    }
}

/*
2
Nguyen Van Nam
Nam
12/12/1997
Mo Lao-Ha Dong-Ha Noi
Tran Van Binh
Nam
11/14/1995
Phung Khoang-Nam Tu Liem-Ha Noi
2
Ao phong tre em
Cai
25000
41000
Ao khoac nam
Cai
240000
515000
3
KH001 MH001 2
KH001 MH002 3
KH002 MH002 4
*/