package com.kyhome.inoutput;

import java.util.Scanner;

public class problem10824 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		StringBuilder sb1 = new StringBuilder(); //동기화가 이루어지지않아 단일스레드에선 조금더 빠름
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<4; i++){
			if(i<2)
				sb1.append(sc.next());
			else
				sb2.append(sc.next());
			
		}
		long A = Long.parseLong(sb1.toString());
		long B = Long.parseLong(sb2.toString());
		System.out.println(A+B);
		sc.close();
		
	}
}
