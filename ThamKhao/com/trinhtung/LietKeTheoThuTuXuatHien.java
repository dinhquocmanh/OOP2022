package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LietKeTheoThuTuXuatHien {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
		ArrayList<String> list = (ArrayList<String>) ois.readObject();
		Set<String> set = new HashSet<String>();
		for (String s : list) {
			s = s.toLowerCase();
			set.addAll(Arrays.asList(s.split("\\s+")));
		}
		Scanner sc = new Scanner(new FileInputStream("VANBAN.in"));
		String s = "";
		List<String> temp = new ArrayList<String>();
		while (sc.hasNextLine()) {
			s += (sc.nextLine() + " ");
		}
		s = s.trim().toLowerCase();
		List<String> vanBan = new ArrayList<String>(Arrays.asList(s.split("\\s+")));
		for (String ss : vanBan) {
			if (set.contains(ss) && !temp.contains(ss)) {
				temp.add(ss);
				System.out.println(ss);
			}
		}
	}
}
