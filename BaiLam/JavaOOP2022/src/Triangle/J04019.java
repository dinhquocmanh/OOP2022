
package Triangle;
import java.util.*;

class Point{
    public double x, y;

    public Point() {
    }
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public static Point nextPoint(Scanner sc){
        Point p = new Point(sc.nextDouble(), sc.nextDouble());
        //System.out.printf("Next point: %d %d %n", p.x, p.y);
        return p;
    }
    
    public static double getDistance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2));
    }
}

class Triangle{
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean valid(){
        double dab=Point.getDistance(this.a,this.b);
        double dac=Point.getDistance(this.a, this.c);
        double dbc=Point.getDistance(this.b,this.c);
        if (dab+dac==dbc || dab+dbc==dac || dac+dbc==dab) return false;
        return true;
    }
//    public float getArea(){
//        float dientich = (float)0.5*(this.b.x-this.a.x)*(this.c.y-this.a.y)-(this.c.x-this.a.x)*(this.b.y-this.a.y);
//        if (dientich<0) dientich*=-1;
//        //System.out.println("dien tich");
//        return dientich;
//    }
    public String getPerimeter(){
        double dab=Point.getDistance(this.a,this.b);
        double dac=Point.getDistance(this.a, this.c);
        double dbc=Point.getDistance(this.b,this.c);
        String peri = String.format("%.3f", dab+dac+dbc);
        return peri;
    }
}

public class J04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}

/*
3
0 0 0 5 0 199
1 1 1 1 1 1
0 0 0 5 5 0
*/