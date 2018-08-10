package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10869 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String i = bf.readLine();
		StringTokenizer st = new StringTokenizer(i, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		System.out.print((a+b)+"\n"+(a-b)+"\n"+(a*b)+"\n"+(a/b)+"\n"+(a%b));
	}
}
