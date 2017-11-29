package com.kyhome.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expert2070 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String test[] = new String[10];
		String result="";
		for(int i =0; i<count; i++) {
			String s = br.readLine();
			test=s.split(" ");
			result=(Integer.parseInt(test[0])>Integer.parseInt(test[1]))?">":(Integer.parseInt(test[0])<Integer.parseInt(test[1]))?"<":"=";
			System.out.println("#"+(i+1)+" "+result);
		}
		
	}
}
