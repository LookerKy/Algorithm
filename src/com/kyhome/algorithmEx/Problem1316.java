package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1316 {
	public static void main(String[] args) throws IOException{
		//�̹̳��� ���ڴ� ���̻� ������ �ȵ�
		//ù���� �迭 �� ��
		//�ι�° ù��°���ڿ� ���Ƶ� ������� , �ٸ�����
		//3��° �ٸ����ڰ� ��������
		//�迭�� ���鼭 �����ڿ� ������ �н� �ٸ��� �������ڿ� �� ������ ������
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i =0; i <N; i++) {
			String s = bf.readLine();
			for(int j=0; j<s.length(); j++) {
				char c = s.charAt(j);
				System.out.println(c);
			}
		}
		
		
		
	}
}
	