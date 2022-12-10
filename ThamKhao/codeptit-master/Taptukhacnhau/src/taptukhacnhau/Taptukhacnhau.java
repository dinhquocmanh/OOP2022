/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taptukhacnhau;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author thedung
 */
class WordSet{
    private String s;

    public WordSet(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+"," ").toLowerCase();
        
        this.s = s;
    }
    public String union(WordSet s2){
        TreeSet<String> list = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String i,String i1){
                return i.compareTo(i1);
            }
        });
        String[] s2Arr = s2.s.split(" ");
        for(int i=0;i<s2Arr.length;i++){
            list.add(s2Arr[i]);
        }
        String[] s1Arr = s.split(" ");
        for(int i=0;i<s1Arr.length;i++){
            list.add(s1Arr[i]);
        }
        String rs = "";
        for(String item:list){
            rs += item + " ";
        }
        return rs;
    }

    public String getS() {
        return s;
    }
    public String intersection(WordSet s1){
        TreeSet<String> list = new TreeSet<>();
        TreeSet<String> rs = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String i,String i1){
                return i.compareTo(i1);
            }
        });
        String[] s2Arr = this.s.split(" ");
        for(int i=0;i<s2Arr.length;i++){
            list.add(s2Arr[i]);
        }
        String[] s1Arr = s1.s.split(" ");
        for(int i=0;i<s1Arr.length;i++){
            if(list.contains(s1Arr[i])){
                rs.add(s1Arr[i]);
            }
        }
        String res = "";
        for(String item:rs){
            res += item + " ";
        }
        return res;
    }
    
}
public class Taptukhacnhau {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner in = new Scanner(new File("VANBAN.in"));
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    
}
