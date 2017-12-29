package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11403 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int g[][] = new int[n+1][n+1];
		int result[][] = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=1; j<=n; j++) {
				g[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		boolean check[] = new boolean[n+1];
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=n; j++) {
				dfs(n,g,check,i,j,result);
			}
			Arrays.fill(check, false);
		}
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void dfs(int n,int g[][], boolean check[], int start, int end, int result[][]) {
		check[start] = true;
		for(int i=1; i<=n;i++) {
			if(g[start][i] ==1) {
				if( i != end && check[i]==false)
					dfs(n,g,check,i,end,result);
				else{
					result[start][end] = 1;
					return;
				}
			}
		}
	}
}
