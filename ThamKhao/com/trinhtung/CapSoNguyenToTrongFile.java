package com.trinhtung;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class CapSoNguyenToTrongFile {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ArrayList<Integer> list1 = (ArrayList<Integer>) ois.readObject();
		ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ArrayList<Integer> list2 = (ArrayList<Integer>) ois.readObject();
		Set<Integer> set1 = new TreeSet<>(list1);
		Set<Integer> set2 = new TreeSet<>(list2);
		for (int i : set1) {
			int j = 1000000 - i;
			if (i < j && isPrime(i) && isPrime(j) && !set2.contains(j) && !set2.contains(i) && set1.contains(j)) {
				System.out.println(i + " " + j);
			}
		}
	}

	public static boolean isPrime(int a) {
		if (a == 1 || a == 0) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
