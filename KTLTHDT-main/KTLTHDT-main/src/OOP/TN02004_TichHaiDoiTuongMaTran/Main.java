/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.TN02004_TichHaiDoiTuongMaTran;

import java.util.*;

/**
 *
 * @author dmanh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
/*
3 4 3
1 2 3 4
4 2 3 1
2 4 1 3
1 1 1
2 2 2
3 3 3
4 4 4
*/