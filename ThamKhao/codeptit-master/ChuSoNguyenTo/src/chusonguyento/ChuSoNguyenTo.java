/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chusonguyento;

import java.util.Scanner;

/**
 *
 * @author thedung
 */
public class ChuSoNguyenTo {

    static int N;
    static int res[] = new int[15];
    static int vs[] = new int[10];
    static int k;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        for (int i = 0; i < 4; i++) {
            vs[i] = 0;
        }
        for (k = 4; k <= N; k++) {
            BT(0, 4);
        }
    }

    public static void BT(int cnt, int du) {
        if (cnt >= k) {
            if (du == 0) {
                if (res[cnt - 1] != 2) {
                    for (int i = 0; i < cnt; i++) {
                        System.out.print(res[i]);
                    }
                    System.out.println();
                }
                //return;
            }
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                res[cnt] = 2;
                if (vs[0] == 0) {
                    vs[0] = 1;
                    BT(cnt + 1, du - 1);
                    vs[0] = 0;
                } else {
                    BT(cnt + 1, du);
                }

            }
            if (i == 1) {
                res[cnt] = 3;
                if (vs[1] == 0) {
                    vs[1] = 1;
                    BT(cnt + 1, du - 1);
                    vs[1] = 0;

                } else {
                    BT(cnt + 1, du);
                }
            }
            if (i == 2) {
                res[cnt] = 5;
                if (vs[2] == 0) {
                    vs[2] = 1;
                    BT(cnt + 1, du - 1);
                    vs[2] = 0;
                } else {
                    BT(cnt + 1, du);
                }

            }
            if (i == 3) {
                res[cnt] = 7;
                if (vs[3] == 0) {
                    vs[3] = 1;
                    BT(cnt + 1, du - 1);
                    vs[3] = 0;
                } else {
                    BT(cnt + 1, du);
                }

            }
        }
    }
}
