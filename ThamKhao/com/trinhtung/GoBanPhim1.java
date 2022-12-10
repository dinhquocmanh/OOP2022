package com.trinhtung;

import java.util.LinkedList;
import java.util.Scanner;

public class GoBanPhim1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int index = 0;
		LinkedList<Character> linkedList = new LinkedList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-') {
				if (!linkedList.isEmpty() && index > 0) {
					linkedList.remove(index - 1);
					index--;
				}
			} else if (s.charAt(i) == '<') {
				if (index > 0) {
					index--;
				}
			} else if (s.charAt(i) == '>') {
				if (index < linkedList.size()) {
					index++;
				}
			} else {
				linkedList.add(index, s.charAt(i));
				index++;
			}
		}
		linkedList.forEach(c -> System.out.print(c));
		sc.close();
	}

}
