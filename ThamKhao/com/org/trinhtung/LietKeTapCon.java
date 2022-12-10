package org.trinhtung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//1
//3
//abc

//a ab abc ac b bc c
public class LietKeTapCon {
	static int b[], n;
	static String s;
	static ArrayList<String> kq;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			b = new int[20];
			kq = new ArrayList<>();
			n = in.nextInt();
			s = in.next();
			quaylui(1);
			Collections.sort(kq);
			for (String s : kq) {
				System.out.print(s + " ");
			}
			System.out.println();

		}
	}

	private static void quaylui(int i) {
		for (int j = 0; j <= 1; j++) {
			b[i] = j;
			if (i == n)
				xuly();
			else
				quaylui(i + 1);
		}
	}

	private static void xuly() {
		String tmp = "";
		for (int i = 1; i <= n; i++) {
			if (b[i] == 1) {
				tmp += s.charAt(i - 1);
			}
		}
		kq.add(tmp);
	}

}
