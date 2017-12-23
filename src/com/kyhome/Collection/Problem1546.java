package com.kyhome.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem1546 {
	public static void main(String[] args)throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());
		String input[] = bf.readLine().split(" ");
		ArrayList<Double> list = new ArrayList<Double>();
		for(int i=0; i<input.length; i++) {
			list.add(Double.parseDouble(input[i]));
		}
		Collections.sort(list);
		double max= list.get(testcase-1);
		//System.out.println(max);
		double avg = 0;
		for(int i=0; i<testcase;i++) {
			avg += (double)(list.get(i)/max)*100;
			//System.out.println(list.get(i) + " " + avg );
		}
		System.out.printf("%.2f",avg/testcase);
	}
}
