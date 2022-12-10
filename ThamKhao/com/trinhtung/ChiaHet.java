package com.trinhtung;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger c = a.mod(b);
			BigInteger d = b.mod(a);
			if(c.equals(new BigInteger("0")) || d.equals(new BigInteger("0"))) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
