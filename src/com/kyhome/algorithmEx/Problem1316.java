package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1316 {
	public static void main(String[] args) throws IOException{
		//이미나온 글자는 더이상 나오면 안되
		//aaabbbccca
		//첫글자 배열 에 들어가
		//두번째 첫번째글자와 같아도 상관없음 , 다른글자
		//3번째 다른글자가 들어왓으면
		//배열에 들어가면서 전글자와 같으면 패스 다르면 그전글자와 비교 같으면 ㅅㄱㄹ
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i =0; i <N; i++) {
			String s = bf.readLine();
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
			}
		}
		
		
		
	}
}
	