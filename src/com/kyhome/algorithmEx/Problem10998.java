package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10998 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String i = bf.readLine();
		String s[] = i.split(" ");
		System.out.println(Integer.parseInt(s[0])*Integer.parseInt(s[1]));
	}
}
