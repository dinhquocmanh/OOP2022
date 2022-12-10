package com.trinhtung;

import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		String s = "abcdef";
		StringBuilder sb = new StringBuilder(s);
		int i = 2;
		int index = -1;
		char c = 'z';
//		sb.deleteCharAt(i);
//		s = s.substring(0, i) + s.substring(i + 1);
		s = s.substring(0, i + index) + c + s.substring(i + index);
		sb.insert(i + index, c);
		System.out.println(sb);
		System.out.println(s);
	}
}
