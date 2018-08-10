package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10430 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int A = Integer.parseInt(st.nextToken());
		int B =Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println((A+B)%C+"\n"+ (A%C + B%C)%C + "\n" +  (A*B)%C + "\n"+(A%C * B%C)%C);
	}
}
