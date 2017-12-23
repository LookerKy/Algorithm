package com.kyhome.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem6321 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(bf.readLine());
		for(int i=0; i<n; i++) {
			String input = bf.readLine();
			sb.append("String "+"#"+(i+1)+"\n");
			for(int j=0; j<input.length();j++) {
				char temp = input.charAt(j);
				char c;
				if(temp !='Z'){
				c = (char)(temp+1);
				}else {
					 c=(char)(temp-25);
				}
				sb.append(c);
			}
			sb.append("\n\n");
		}
		System.out.println(sb.toString());
	}
}
