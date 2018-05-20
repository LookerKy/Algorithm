package com.kyhome.inoutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem11718 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sList = new ArrayList<String>();
		
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if(input == null || input.isEmpty()) {
				break;
			}
			sList.add(input);
		}
		
		for(String x : sList) {
			System.out.println(x);
		}
		
		sc.close();
	}
}
