package com.trinhtung;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TinhTong {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileInputStream("DATA.in"));
		long sum = 0;
		while(true) {
			try {
				String s = sc.next();
				if(s.matches("\\d+")  && s.length() < 11) {
					Long i = Long.valueOf(s);
					sum += i;
				}
			} catch (NoSuchElementException e) {
				System.out.println(sum);
				break;
			}
		}
	}
}
