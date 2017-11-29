package com.kyhome.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expert2071 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String test[] = new String[10];
		double result =0;
		for(int i =0; i<count; i++) {
			String s = br.readLine();
			test=s.split(" ");
			for(int j=0 ; j<test.length; j++) {
				result += Integer.parseInt(test[j]);
			
			}
			result /=test.length;
			System.out.println("#"+(i+1)+" "+Math.round(result));
			result=0;
		}
		
	}
}
