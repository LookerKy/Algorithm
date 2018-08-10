package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15552 {
	//for¹®
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(bf.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int j = 0; j<i; j++) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(a+b)+"\n");
		}
		bf.close();
		
		bw.close();
	}
}
