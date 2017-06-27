package com.kyhome.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class problem1764 {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String input[] = s.split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		HashMap<String, Integer> nol = new HashMap<String, Integer>();
		HashMap<String, Integer> nos = new HashMap<String, Integer>();
		TreeSet<String> result = new TreeSet<String>();
		ArrayList<String> listen = new ArrayList<String>();
		ArrayList<String> see = new ArrayList<String>();
		for(int i=0; i<a; i++){
			listen.add(bf.readLine());
			nol.put(listen.get(i), 1);
		}
		for(int i=0; i<b; i++){
			see.add(bf.readLine());	
			nos.put(see.get(i),1);
		}
		if(a>b){
			for(int i=0; i<b;i++){
				if(nol.containsKey(see.get(i))){
					result.add(see.get(i));
				}
			}
		}else{
			for(int i=0; i<a; i++){
				if(nos.containsKey(listen.get(i))){
					result.add(listen.get(i));
				}
			}
		}
		System.out.println(result.size());
		for(String x : result)
			System.out.println(x);
		
		/*************이러한 방법도잇음 ***************/
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//
//		Set<String> neverHeard = new TreeSet<String>();
//		for (int i = 0; i < n; i++) {
//			neverHeard.add(scan.next());
//		}
//
//		Set<String> result = new TreeSet<String>();
//		for (int i = 0; i < m; i++) {
//			String name = scan.next();
//			if (neverHeard.contains(name)) {
//				result.add(name);
//			}
//		}
//
//		System.out.println(result.size());
//		for (String name : result) {
//			System.out.println(name);
//		}
		/***********************************/
	}
}
