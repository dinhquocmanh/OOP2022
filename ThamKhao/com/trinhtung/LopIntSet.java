package com.trinhtung;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LopIntSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m =sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[m];
		int[] b= new int[n];
		for(int i = 0;i < m;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i < n;i++) {
			b[i] = sc.nextInt();
		}
		IntSet1 s1 = new IntSet1(a);
		IntSet1 s2 = new IntSet1(b);
		IntSet1 s3 = s1.union(s2);
		System.out.println(s3);
		sc.close();
	}
	
}
class IntSet1 {
	int[] arr;
	Set<Integer> s = new TreeSet<>((i1,i2) -> i1.compareTo(i2));
	public IntSet1(int[] arr) {
		super();
		this.arr = arr;
		for(int i : arr) {
			s.add(i);
		}
	}
	public IntSet1() {
		
	}
	public IntSet1 union(IntSet1 i) {
		IntSet1 is = new IntSet1();
		is.s.addAll(this.s);
		is.s.addAll(i.s);
		return is;
	}
	@Override
	public String toString() {
		String res = "";
		for(int i : s) {
			res += (i + " ");
		}
		res = res.trim();
		return res;
	}
}
