package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem11403dfs {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int g[][] = new int[n + 1][n + 1];
		int result[][] = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int j = 1; j <= n; j++) {
				g[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (g[i][j] == 1) {
					list.get(i).add(j);
				}
			}
//			System.out.println(list.get(i).iterator().toString());
		}
//		 for(int i=1; i<=n; i++) {
//		 for(int j=0;j<list.get(i).size(); j++) {
//		 System.out.print(list.get(i).get(j)+ " ");
//		 }System.out.println();
//		 }
		for (int i = 1; i <= n; i++) {
			dfs(list, result, i, i);
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				sb.append(result[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void dfs(ArrayList<List<Integer>> list, int result[][], int start, int next) {
		for (int j = 0; j < list.get(next).size(); j++) {
			int next_t = list.get(next).get(j);
			if (result[start][next_t] != 1) {
				result[start][next_t] = 1; 
				dfs(list, result, start, next_t);
			}
		}
	}
/* hello world 
4
0 0 0 0
1 0 1 0
0 1 0 1
1 0 1 0
*/
}
