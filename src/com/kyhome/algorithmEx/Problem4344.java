package com.kyhome.algorithmEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Problem4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int sum =0;
		int result =0;
		for(int i = 0; i<N ; i++) {
				String s = br.readLine();
				String score[] = s.split(" ");
				int person = Integer.parseInt(score[0]);
				for(int j = 1; j<score.length; j++) {
					sum += Integer.parseInt(score[j]);
				}
				int avg = sum/person;
				for(int j=1; j<score.length; j++) {
					if(Integer.parseInt(score[j]) > avg) {
						result++;
					}
				}
				float temp = (result/(float)person)*100;
				String output = String.format("%.3f", temp);
				bw.write(output+"%\n");
				result=0;
				sum=0;
		}
		br.close();
		
		bw.close();
	}
}
//가장 빠른코드

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
//		int num = Integer.parseInt( br.readLine() );
//		StringTokenizer token;
//		StringBuffer sb = new StringBuffer("");
//		for ( int i = 0; i < num; i++ ) {
//			token = new StringTokenizer(br.readLine());
//			int n = Integer.parseInt( token.nextToken() );
//			double ave = 0;
//			int[] ar = new int[n];
//			for(int j=0; j<n; j++) {
//				ar[j] = Integer.parseInt(token.nextToken());
//				ave += ar[j];
//			}
//			ave /= n;
//			double result = 0;
//			for(int j=0; j<n; j++) {
//				if(ar[j] > ave) {
//					result++;
//				}
//			}
//			sb.append( String.format( "%.3f", (result/n)*100 ) + "%\n" );
//		}
//		System.out.print( sb.toString() );
//	}
//}

