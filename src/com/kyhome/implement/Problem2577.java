package com.kyhome.implement;

import java.util.Scanner;

public class Problem2577 {
	public static void main(String[] args) {
		int A , B,C;
		Scanner sc = new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		sc.close();
		int num [] = new int[10];
		num[0]=0;
		int multi = A*B*C;
		String result = String.valueOf(multi);
		for(int i =0; i<result.length(); i++) {
			char temp = result.charAt(i);
			int j = temp-48;
			num[j]++;
		}
		for(int i=0; i<num.length;i++)
			System.out.println(num[i]);
		}
	
}
