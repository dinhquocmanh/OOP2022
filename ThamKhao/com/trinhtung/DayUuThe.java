package com.trinhtung;

import java.util.Scanner;

public class DayUuThe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			String[] s = sc.nextLine().trim().split(" ");
			int chan = 0;
			int le = 0;
			int length = s.length;
			for(int i = 0;i < s.length;i++) {
				if(Integer.valueOf(s[i]) % 2 == 0) {
					chan++;
				} else {
					le++;
				}
			}
			if((length % 2 == 0 && chan > le) || (length % 2 == 1 && le > chan)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
