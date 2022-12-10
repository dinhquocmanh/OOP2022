package org.trinhtung;

import java.util.Scanner;

public class ToHopCNK {

	public static void main(String[] args) {
		int[][] arr = new int[1005][1005];
		Scanner sc = new Scanner(System.in);
		int mod = 1000000007;
		for (int i = 0; i <= 1000; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j || j == 0) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = (arr[i - 1][j] + arr[i - 1][j - 1]) % mod;
				}
			}
		}
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			System.out.println(arr[n][k]);
		}
		sc.close();
	}
}
