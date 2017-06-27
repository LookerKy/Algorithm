package com.kyhome.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class problem1076 {
	HashMap<String, Integer> map1 = new HashMap<String, Integer>();
	public static void main(String[] args) throws IOException  {
		problem1076 p = new problem1076();
		p.initMap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String color1 = br.readLine();
		String color2 = br.readLine();
		String color3 = br.readLine();
		
		long result = p.map1.get(color1)*10+p.map1.get(color2);
		for(int i=0; i<p.map1.get(color3); i++){
			result *=10;
		}
		System.out.println(result);
		
	}
	public void initMap(){
		
		map1.put("black", 0);
		map1.put("brown", 1);
		map1.put("red", 2);
		map1.put("orange", 3);
		map1.put("yellow", 4);
		map1.put("green", 5);
		map1.put("blue", 6);
		map1.put("violet", 7);
		map1.put("grey", 8);
		map1.put("white", 9);
	}
}
