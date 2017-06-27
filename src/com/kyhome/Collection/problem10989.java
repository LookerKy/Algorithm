package com.kyhome.Collection;

import java.util.Scanner;

public class problem10989 {
	/********* 참고: 계수정렬 ***********/
	/**************참고site: http://nhs0912.tistory.com/58******************/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numcount[] = new int[10001];
		for(int i =0; i<n; i++){
			int j = sc.nextInt();
			numcount[j]++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<numcount.length; i++){
			for(int j=0; j<numcount[i]; j++){
				sb.append(i);
				sb.append('\n');
			}
		}
		sc.close();
		System.out.println(sb.toString());
	}
}
