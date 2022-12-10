package com.trinhtung;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class So0VaSo9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Queue<String> q = new LinkedList<>();
			q.add("9");
			while (true) {
				String temp = q.remove();
				if (temp.length() > 18)
					break;
				else {
					if (Integer.parseInt(temp) % n == 0) {
						System.out.println(Integer.parseInt(temp));
						break;
					} else {
						q.add(temp + '0');
						q.add(temp + '9');
					}
				}
			}
		}
		sc.close();
	}
}