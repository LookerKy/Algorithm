package com.kyhome.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem4948 {
	static int k = (123456*2)+1;
	static ArrayList<Boolean> primeList = new ArrayList<Boolean>(k);
	public static void main(String[] args)throws IOException {
		prime();
		input();
	}
	public static void input()throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(bf.readLine());
			if(n==0)
				break;
			solution(n);
		}
	}
	public static void solution(int n) {
		int count = 0;
		for(int i=n+1; i<=(n*2);i++) {
			if(primeList.get(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void prime() {
		int size=k-1;
		primeList.add(false);
		primeList.add(false);
		for(int i =2; i<=size; i++)
			primeList.add(i,true);
	
		for(int i=2; (i*i)<=size; i++) {
			if(primeList.get(i)) {
				for(int j= i*i; j<=size;j+=i) {
					primeList.set(j,false);
				}
			}
		}
		
}
}