package com.trinhtung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LopPolygon {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("POLYGON.in"));
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			Point p[] = new Point[n];
			for (int i = 0; i < n; i++) {
				p[i] = new Point(in.nextInt(), in.nextInt());
			}
			Polygon poly = new Polygon(p);
			System.out.println(poly.getArea());
		}
	}
}

class Point {
	int x;
	int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

class Polygon {
	Point[] points;

	public Polygon(Point[] p) {
		this.points = p;
	}

	public String getArea() {
		double sum = 0;
		for (int i = 0; i < points.length; i++) {
			if (i == 0) {
				sum += points[i].x * (points[i + 1].y - points[points.length - 1].y);
			} else if (i == points.length - 1) {
				sum += points[i].x * (points[0].y - points[i - 1].y);
			} else {
				sum += points[i].x * (points[i + 1].y - points[i - 1].y);
			}
		}

		double area = 0.5 * Math.abs(sum);
		return String.format("%.3f", area);
	}

}
