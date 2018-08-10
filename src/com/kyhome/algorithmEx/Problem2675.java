package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2675 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<T ; i++) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			int n = Integer.parseInt(st.nextToken());
			for(int j =2; j<input.length(); j++) {
				char e = input.charAt(j);
				String temp = String.valueOf(e);
				for(int k =0; k<n; k++) {
					sb.append(temp);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
