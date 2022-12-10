package com.trinhtung;

import java.util.Scanner;

public class BienSoDep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String bien = sc.nextLine();
			String s = bien.substring(5).replace(".", "");
			if(tangDan(s) || bangNhau(s) || locPhat(s) || dauCuoi(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		sc.close();
	}

	static boolean tangDan(String s) {
		for (int i = 0; i < 4; i++) {
			if (Integer.valueOf(s.charAt(i) + "") >= Integer.valueOf(s.charAt(i + 1) + "")) {
				return false;
			}
		}
		return true;
	}

	static boolean bangNhau(String s) {
		for (int i = 0; i < 4; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	static boolean dauCuoi(String s) {
		for (int i = 0; i < 2; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				return false;
			}
		}
		for (int i = 3; i < 4; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	static boolean locPhat(String s) {
		for (int i = 0; i < 5; i++) {
			if (s.charAt(i) != '8' && s.charAt(i) != '6') {
				return false;
			}
		}
		return true;
	}
}
