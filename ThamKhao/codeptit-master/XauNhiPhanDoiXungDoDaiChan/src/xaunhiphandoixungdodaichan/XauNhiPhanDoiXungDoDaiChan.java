/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xaunhiphandoixungdodaichan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class XauNhiPhanDoiXungDoDaiChan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BT(n);
        }
    }

    public static void BT(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("1");
        int i = 0;
        while (!q.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            String tmp = q.poll();
            String res = tmp + sb.append(tmp).reverse().toString();
            if (res.length() > n) {
                break;
            }
            System.out.print(res + " ");
            q.add(tmp + "0");
            q.add(tmp + "1");
        }
        System.out.println();
    }

}
