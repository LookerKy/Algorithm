package com.kyhome.Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class problem11279 {
	static class Compare implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare cmp = new Compare();
		PriorityQueue<Integer> po = new PriorityQueue<Integer>(1, cmp);
		
		int n = sc.nextInt();
		while(n-- > 0){
			int x = sc.nextInt();
			if(x == 0){
				if(po.isEmpty()){
				System.out.println(0);
				}else{
					System.out.println(po.poll());
				}
			}else{
				po.offer(x);
			}
		}
		sc.close();
	}
}
