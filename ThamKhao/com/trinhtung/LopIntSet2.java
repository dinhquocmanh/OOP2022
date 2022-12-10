package com.trinhtung;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LopIntSet2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DATA.in"));
		int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		IntSet s1 = new IntSet(a);
		IntSet s2 = new IntSet(b);
		IntSet s3 = s1.intersection(s2);
		System.out.println(s3);
	}

}

class IntSet {
	int[] arr;
	Set<Integer> s = new TreeSet<>((i1, i2) -> i1.compareTo(i2));

	public IntSet(int[] arr) {
		super();
		this.arr = arr;
		for (int i : arr) {
			s.add(i);
		}
	}

	public IntSet() {

	}

	public IntSet intersection(IntSet i) {
		IntSet is = new IntSet();
		is.s.addAll(this.s);
		is.s.retainAll(i.s);
		return is;
	}

	@Override
	public String toString() {
		String res = "";
		for (int i : s) {
			res += (i + " ");
		}
		res = res.trim();
		return res;
	}
}
