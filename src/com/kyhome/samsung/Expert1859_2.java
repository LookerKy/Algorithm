package com.kyhome.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expert1859_2 {
	static long result = 0;
	static int maxvalue = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testcase; i++) {
			
			sb.append("#" + (i+1) + " ");
			int n = Integer.parseInt(bf.readLine());
			String temp[] = bf.readLine().split(" ");
			int map[] = new int[n];
			for (int j = 0; j < n; j++) {
				map[j] = Integer.parseInt(temp[j]);
			}
			//func
			func(n,map);
			sb.append(result+"\n");
			
		}
		System.out.println(sb.toString());
	}
	public static void func(int n, int[] map) {
		result=0;
		maxvalue = map[n - 1];
		for (int j = n - 2; j >= 0; j--) {
			if (maxvalue > map[j]) {
				result += (maxvalue - map[j]);
			} else {
				maxvalue = map[j];
			}
		}
	}

}
