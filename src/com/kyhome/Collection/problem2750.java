package com.kyhome.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem2750 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i =0; i<n; i++){
			int temp=sc.nextInt();
			list.add(temp);
		}
		sc.close();
		Collections.sort(list);//collection�� �̿��� �������� ��Ʈ (3�� ���� ��������¹޾Ƽ�)
		for(int x : list){
			System.out.println(x);
		}
	}
}
