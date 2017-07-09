package com.kyhome.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str[] = bf.readLine().split(" ");

		String num[] = bf.readLine().split(" ");
		int cmp = Integer.parseInt(str[1]);
		for(int i= 0 ; i<Integer.parseInt(str[0]); i++) {
			if(Integer.parseInt(num[i])<cmp)
				System.out.print(num[i]+" ");
		}
		
		
	}
}
