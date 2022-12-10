package com.trinhtung;

import java.util.Scanner;
import java.util.Vector;

public class QuanMa {

	static boolean isInside(int x, int y, int N) {
		if (x >= 1 && x <= N && y >= 1 && y <= N)
			return true;
		return false;
	}

	static int result(int start[], int end[], int N) {
		int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
		int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

		Vector<Cell> q = new Vector<>();

		q.add(new Cell(start[0], start[1], 0));

		Cell t;
		int x, y;
		boolean visit[][] = new boolean[N + 1][N + 1];

		for (int i = 1; i <= N; i++)
			for (int j = 1; j <= N; j++)
				visit[i][j] = false;

		visit[start[0]][start[1]] = true;

		while (!q.isEmpty()) {
			t = q.firstElement();
			q.remove(0);

			if (t.x == end[0] && t.y == end[1])
				return t.dis;

			for (int i = 0; i < 8; i++) {
				x = t.x + dx[i];
				y = t.y + dy[i];

				if (isInside(x, y, N) && !visit[x][y]) {
					visit[x][y] = true;
					q.add(new Cell(x, y, t.dis + 1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s1 = sc.next();
			String s2 = sc.next();
			int a = s1.charAt(0) - 96;
			int b = Integer.valueOf(s1.charAt(1) + "");
			int c = s2.charAt(0) - 96;
			int d = Integer.valueOf(s2.charAt(1) + "");
			int N = 30;
			int start[] = { a, b };
			int end[] = { c, d };
			System.out.println(result(start, end, N));
		}
		sc.close();
	}
}

class Cell {
	int x, y;
	int dis;

	public Cell(int x, int y, int dis) {
		this.x = x;
		this.y = y;
		this.dis = dis;
	}
}