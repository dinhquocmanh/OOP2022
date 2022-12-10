package com.trinhtung;

import java.util.Scanner;

public class LopPair {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean check = false;
			for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
				Pair p = new Pair(i, n - i);
				if (p.isPrime()) {
					System.out.println(p);
					check = true;
					break;
				}
			}
			if (!check)
				System.out.println(-1);
		}
		sc.close();
	}
}

class Pair {
	private int a;
	private int b;
	
	public Pair(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public boolean isPrime() {
		if(snt(a) && snt(b)) {
			return true;
		}
		return false;
	}
	public static boolean snt(int n) {
	    for (int i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return a + " " + b;
	}
}
