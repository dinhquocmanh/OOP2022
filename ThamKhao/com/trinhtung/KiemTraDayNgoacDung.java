package com.trinhtung;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			System.out.println(check(s) ? "YES" : "NO");
		}
		sc.close();
	}

	static boolean check(String str) {
		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '{' || c == '[')
				s.push(c);
			else {
				if (!s.empty() && c == ']' && s.lastElement() == '[') {
					s.pop();
				} else if (!s.empty() && c == '}' && s.lastElement() == '{') {
					s.pop();
				} else if (!s.empty() && c == ')' && s.lastElement() == '(') {
					s.pop();
				} else {
					return false;
				}
			}
		}
		return true;
	}
}
