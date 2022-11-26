
package oop;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class GameThu{
    private String manguoichoi, tennguoichoi;
    private Date giovao, giora;
    private long giochoi;
    
    public GameThu(String manguoichoi, String tennguoichoi, Date giovao, Date giora) {
        this.manguoichoi = manguoichoi;
        this.tennguoichoi = tennguoichoi;
        this.giovao = giovao;
        this.giora = giora;
        this.giochoi = giora.getTime()-giovao.getTime();
    }
    

    public int compareTo(GameThu gt){
        return Long.compare(this.giochoi, gt.giochoi);
    }
    
    public String toString(){
        // todo
        int h = (int) this.giochoi/60000/60;
        int m = (int) this.giochoi/60000%60;
        return String.format("%s %s %d gio %d phut", this.manguoichoi, this.tennguoichoi, h, m);
    }
}

public class J05011 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<GameThu> ListGT = new ArrayList<>();
        
        // read 
        while(t-->0){
            String format = "hh:mm";
            String manguoichoi = sc.nextLine();
            String tennguoichoi = sc.nextLine();
            Date giovao = new SimpleDateFormat(format).parse(sc.nextLine());
            Date giora = new SimpleDateFormat(format).parse(sc.nextLine());
            GameThu gt = new GameThu(manguoichoi, tennguoichoi, giovao, giora);
            ListGT.add(gt);
        }
        
        //sort
        Collections.sort(ListGT, (gt1,gt2) -> {return gt2.compareTo(gt1);});
        
        //printout
        for(GameThu gt: ListGT){
            System.out.println(gt);
        }
    }
}

/*
3
01T
Nguyen Van An
09:00
10:30
06T
Hoang Van Nam
15:30
18:00
02I
Tran Hoa Binh
09:05
10:00
*/
