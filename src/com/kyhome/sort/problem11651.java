package com.kyhome.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class problem11651 {
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		Point p[] = new Point[n];
		for(int i=0; i<n; i++){
			String temp[] = bf.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			p[i] = new Point(x,y);
		}
		Arrays.sort(p, new Comparator<Point>() {

			@Override
			public int compare(Point c1, Point c2) {
				// TODO Auto-generated method stub
				return (c1.y!=c2.y? (c1.y-c2.y):(c1.x-c2.x));
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Point r : p)
			sb.append(r.x +" " + r.y+"\n");
		System.out.println(sb);
	}
}
