package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1157 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int index[] = new int [91];
		s = s.toUpperCase();
		for(int i =0; i<s.length(); i++) {
			char c = s.charAt(i);
			index[(int)c]++;
		}
		int max = index[0];
		int maxIndex = 0;
		String output ="";
		for(int i=0; i<index.length; i++) {
			if(index[i] > max){
				max = index[i];
				maxIndex = i;
			}else if(index[i] == max) {
				maxIndex = 63;
			}
			
		}
		char o = (char)maxIndex;
		output = String.valueOf(o);
		System.out.println(output);
	}
}
