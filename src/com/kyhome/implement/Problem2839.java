package com.kyhome.implement;

import java.util.Scanner;

public class Problem2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int five = n/5;
		int k = n%5;
		int result=0;
		//5에서 나눈나머지가 0,1,2,3 인 경우 에따라 
		switch(k) {
			case 0 : 
				result=five;
				break;
			case 1 : //나머지가 1인경우 몫에서 -1 을 뺀후 나머지+5 /3
				if(five-1 <0) {
					result = -1;
					break;
				}else {
					int temp = five-1;
					int tempt = (k+5)/3;
					result=temp+tempt;
					break;
				}
			case 2 :
				if(five-2 <0) {
					result = -1;
					break;
				}else {
					int temp = five-2;
					int tempt = (k+10)/3;
					result = temp+tempt;
					break;
				}
			case 3 :
				result = five + (k/3);
				break;
			case 4 :
				if(five-1<0) {
					result = -1;
					break;
				}else {
					int temp = five-1;
					int tempt = (k+5)/3;
					result=temp+tempt;
					break;
				}
		}
		System.out.println(result);
		}
//    Scanner scan = new Scanner(System.in);
//    int a = scan.nextInt();
//
//    int x = a / 5;
//
//    for (; ((a - 5 * x) % 3) > 0; x--) ; // 나머지를 3으로 나눈 나머지가 0이 될때까지 5의 몫 감소 
//
//    System.out.println((x<0)?"-1":(a - 5 * x) / 3 + x);//5의 몫이 0보다 작을경우 -1출력 아닐경우
														 //(입력값 - 수정된 몫 *5)/3 + 수정된몫  출력
										
	}
	