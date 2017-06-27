package com.kyhome.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class problem11023 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
//		int sum = 0;
//		sb.append(sc.nextLine());
//		StringTokenizer st = new StringTokenizer(sb.toString());
//		
//		while(st.hasMoreTokens()){
//			sum += Integer.parseInt(st.nextToken());	 
//		}
//		System.out.println(sum);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum=0;
		while(st.hasMoreTokens()){
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
		
	}
}

