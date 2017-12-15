package com.kyhome.wronganswernote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Problem5567wrong {
	public static void main(String[] args) throws IOException {
		 new Problem5567wrong().adjacencyMatrix();
	}
	private void adjacencyMatrix() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int m = Integer.parseInt(bf.readLine());
		boolean list[][] = new boolean[n+1][n+1];
		boolean check[] = new boolean[n+1];
		ArrayList<Integer> result = new ArrayList<Integer>();
		int cnt = 0;
		for(int i =0; i <m; i++) {
			StringTokenizer st  = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			if(u == 1) {
				result.add(v);
				cnt++;
				check[v] = true;
			}
			
			list[u][v] = true; list[v][u]=true;
			
		}
		for(int i : result) {
			
			for(int j = 2; j<=n; j++) {
				if(list[i][j] && !check[j]) {
					cnt++;
					check[j] = true;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
