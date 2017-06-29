package com.kyhome.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ExComparator {
	static class Compare implements Comparable<Compare>{
		
		int x,y;
		Compare(int x, int y){
			this.x= x;
			this.y =y;
		}
		@Override
		public int compareTo(Compare o) {
			if(this.x < o.x){
				return -1;	
			}else if(this.x == o.x){
				if(this.y < o.y){
					return -1;
				}else if(this.y == o.y){
					return 0;
				}else{
					return 1;
				}
			}else{
				return 1;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Compare c[] = new Compare[n];
		for(int i=0; i<n; i++){
			String temp[] = br.readLine().split(" ");
			int x = Integer.parseInt(temp[0]);
			int y = Integer.parseInt(temp[1]);
			c[i] = new Compare(x,y);
		}
		Arrays.sort(c, new Comparator<Compare>() {

			@Override
			public int compare(Compare o1, Compare o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		StringBuilder sb = new StringBuilder();
		for(Compare p : c)
			sb.append(p.x + " " + p.y + "\n");
		
		System.out.println(sb);
	}
}
