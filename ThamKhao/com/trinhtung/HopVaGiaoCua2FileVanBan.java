package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HopVaGiaoCua2FileVanBan {
	public static void main(String[] args) throws IOException {
		WordSet s1 = new WordSet("DATA1.in");
		WordSet s2 = new WordSet("DATA2.in");
		System.out.println(s1.union(s2));
		System.out.println(s1.intersection(s2));
	}
}

class WordSet {
	Set<String> set = new TreeSet<>((s1, s2) -> s1.compareTo(s2));

	public WordSet(String file) throws IOException {
		Scanner sc = new Scanner(new FileInputStream(file));
		while (true) {
			try {
				String s = sc.nextLine().toLowerCase();
				set.addAll(Arrays.asList(s.split("\\s+")));
			} catch (NoSuchElementException e) {

				break;
			}
		}
	}

	public String intersection(WordSet ws) {
		Set<String> set = new TreeSet<>((s1, s2) -> s1.compareTo(s2));
		set.addAll(new TreeSet<>(ws.set));
		set.retainAll(new TreeSet<>(this.set));
		String res = "";
		for (String s : set) {
			res += (s + " ");
		}
		return res;
	}

	public String union(WordSet ws) {
		Set<String> set = new TreeSet<>((s1, s2) -> s1.compareTo(s2));
		set.addAll(new TreeSet<>(ws.set));
		set.addAll(new TreeSet<>(this.set));
		String res = "";
		for (String s : set) {
			res += (s + " ");
		}
		return res;
	}
}