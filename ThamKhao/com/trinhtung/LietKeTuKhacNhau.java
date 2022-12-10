package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LietKeTuKhacNhau {
	public static void main(String[] args) throws IOException {
		WordSet2 ws = new WordSet2("VANBAN.in");
		System.out.println(ws);
	}
}

class WordSet2 {
	Set<String> set = new TreeSet<>((s1, s2) -> s1.compareTo(s2));

	public WordSet2(String file) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("VANBAN.in"));
		while (true) {
			try {
				String s = sc.nextLine().toLowerCase();
				set.addAll(Arrays.asList(s.split("\\s+")));
			} catch (NoSuchElementException e) {

				break;
			}
		}
	}

	@Override
	public String toString() {
		String res = "";
		for (String s : set) {
			res += (s + "\n");
		}
		return res;
	}
}
