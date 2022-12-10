package com.trinhtung;

import java.util.Scanner;

public class GoBanPhim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().trim();
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '<' && s.charAt(i) != '>' && s.charAt(i) != '-') {
				index = i;
				break;
			}
		}
		s = s.substring(index);
		index = 0;
//		<<PI<T>>Ta-
//		<<PIT>>Ta-
//		<<PI<T->Ta-
		StringBuilder sb = new StringBuilder(s);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '<') {
				index--;
				if (i + index < 0) {
					index = (i * -1);
				}
				sb.deleteCharAt(i);
				i--;
			} else if (sb.charAt(i) == '>') {
				s = s.substring(0, i) + s.substring(i + 1);
				sb.deleteCharAt(i);
				index = (index < 0) ? ++index : 0;
				i--;
			} else if (sb.charAt(i) == '-') {
				sb.delete(i - 1, i + 1);
				i -= 1;
			} else {
				if (index != 0) {
					char c = sb.charAt(i);
					sb.deleteCharAt(i);
					sb.insert(i + index, c);
				}
			}
		}
		System.out.println(sb);
		sc.close();
	}
}
