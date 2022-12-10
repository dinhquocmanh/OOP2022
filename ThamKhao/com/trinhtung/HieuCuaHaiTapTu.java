package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HieuCuaHaiTapTu {
	public static void main(String[] args) throws IOException {
		W s1 = new W("DATA1.in");
		W s2 = new W("DATA2.in");
		System.out.println(s1.difference(s2));
		System.out.println(s2.difference(s1));
	}
}

class W {
	Set<String> ss = new TreeSet<String>((s1, s2) -> s1.compareTo(s2));

	public W(String f) throws IOException {
		Scanner sc = new Scanner(new FileInputStream(f));
		String sss = "";
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			sss += (s + " ");
		}
		ss.addAll(Arrays.asList(sss.trim().toLowerCase().split("\\s+")));
	}

	public String difference(W s2) {
		String res = "";
		Set<String> s = s2.ss;
		for (String sss : ss) {
			if (!s.contains(sss)) {
				res += (sss + " ");
			}
		}
		return res.trim();
	}
}
