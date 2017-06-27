package com.kyhome.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> list = new ArrayList<Long>();
		for(int i =0; i<n; i++){
			long temp = sc.nextLong();
			list.add(temp);
		}
		Collections.sort(list);
		for(long x : list)
			System.out.println(x);
		sc.close();

	}
}
