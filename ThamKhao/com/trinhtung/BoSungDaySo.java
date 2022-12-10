package com.trinhtung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoSungDaySo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Integer> l = new ArrayList<Integer>();
		l.add(0);
		boolean isOk = true;
		for(int i = 0;i < t;i++) {
			int a = sc.nextInt();
			l.add(a);
			if(a > l.get(i) + 1) {
				isOk = false;
				for(int j = l.get(i) + 1;j < a;j++) {
					System.out.println(j);
				}
			}
		}
		if(isOk) {
			System.out.println("Excellent!");
		}
		sc.close();
	}
}	
