package com.kyhome.inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Problem11719 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> ar = new ArrayList<String>();
		String str;
		while((str = br.readLine()) != null) {
			ar.add( str+"\n" );
		}
		for(int i=0; i<ar.size(); i++) {
			System.out.print( ar.get( i ) );
		}
	}
}
