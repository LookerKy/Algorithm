package com.kyhome.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11720 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String n  = bf.readLine();
		int i = Integer.parseInt(n);
		int sum=0;
		String num[] = bf.readLine().split("");
		for(int j=0; j<i ; j++) {
			sum += Integer.parseInt(num[j]);
		}
		System.out.println(sum);
	}
}
