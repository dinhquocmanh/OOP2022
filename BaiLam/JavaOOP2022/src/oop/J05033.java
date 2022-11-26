
package oop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Time{
    private short hour, minute, second; 

    public Time(short hour, short minute, short second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    
    public short compareTo(Time t){
        int a = this.hour*60*60+this.minute*60+this.second - (t.hour*60*60+t.minute*60+t.second);
        if(a>0) return 1;
        else if(a<0) return -1;
        else return 0;
    }
    
    @Override
    public String toString(){
        return String.format("%d %d %d", this.hour, this.minute, this.second);
    }
}

public class J05033 {
    
    public static void main(String[] args) {
        ArrayList<Time> listTime = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        
        for (int i = 0; i < n; i++) {
            Time t = new Time(sc.nextShort(), sc.nextShort(), sc.nextShort());
            listTime.add(t);
        }
          
        // sort
        Collections.sort(listTime, (t1,t2) -> {
            return t1.compareTo(t2);
        });
        
        // print out
        for (Time t : listTime){
            System.out.println(t);
        }
    }
}

/*
3
11 20 20
14 20 14
11 15 12
*/