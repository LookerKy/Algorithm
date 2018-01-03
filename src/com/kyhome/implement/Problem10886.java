package com.kyhome.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10886 {
	static int array[] = new int[101];
	static int n = 0;
	public static void main(String[] args) throws IOException {
		input();
		solution();
	}
	public static void input() throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(bf.readLine());
		for(int i=0; i<n; i++) {
			array[i] = Integer.parseInt(bf.readLine());
		}
	}
	public static void solution() {
		StringBuilder sb = new StringBuilder();
		sb.append("Junhee is ");
		int cute = 0;
		int not_cute =0;
		for(int i=0; i<n; i++) {
			if(array[i]==1) {
				cute++;
			}else {
				not_cute++;
			}
		}
		System.out.println(cute>not_cute?sb.append("cute!").toString():sb.append("not cute!").toString());
	}
}
