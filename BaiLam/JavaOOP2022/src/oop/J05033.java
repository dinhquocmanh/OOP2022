
package oop;
import java.util.*;

class Time{
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int to_second(){
        return this.hour*60*60+this.minute*60+this.second;
    }
    
    public int compareTo(Time t){
        return Integer.compare(this.to_second(), t.to_second());
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
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Time t = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
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