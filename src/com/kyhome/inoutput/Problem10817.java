package com.kyhome.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10817 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		//System.out.println(a>b?a>c?a:c:b>c?b:c);//ÃÖ´ñ°ª
		System.out.println(a>b?a>c?b>c?b:c:a:b>c?a>c?a:c:b);
	}
}
