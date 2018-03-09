package com.kyhome.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem11718 {
	public static void main(String[] args)throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true) {
			String s = bf.readLine();
			if(s.equals(""))
				break;
			else {
				sb.append(s+"\n");
			}
		}
		System.out.println(sb.toString());
	}
}
