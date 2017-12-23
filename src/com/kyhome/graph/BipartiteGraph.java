package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//Problem1707(이분 그래프)
public class BipartiteGraph {
	/*
	 * 그래프를 A와 B로 나눌 수 있으면 이분 그래프라고 한다. A에 포함되어 있는 정점끼리 연결되어있는 간선이없다. B에 포함되어 있는
	 * 정점끼리 연결되어있는 간선이없다. 모든 간산의 한 끝 점은 A에, 다른 끝 점은 B에 이분 그래프에선 check[]의 의미가 다르게
	 * 쓰인다. 1 일땐 방문했고 빨간색(A그래프) 2 일땐 방문했고 빨간색(B그래프)
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();
			for (int i = 0; i <= n; i++) {
				list.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(bf.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());
				list.get(u).add(v);
				list.get(v).add(u);
			}
			int color[] = new int[n + 1];
			boolean ok = true;
			for (int i = 1; i <= n; i++) {
				if (color[i] == 0) {
					dfs(list, color, i, 1);
				}
			}
			for (int i = 1; i <= n; i++) {
				for (int j : list.get(i)) {
					if (color[i] == color[j]) {
						ok = false;
					}
				}
			}
			if (ok) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static void dfs(ArrayList<List<Integer>> list, int[] color, int x, int c) {
		color[x] = c;
		for (int y : list.get(x)) {
			if (color[y] == 0) {
				dfs(list, color, y, 3 - c);
			}
		}
	}
/* input line 1 -> testcase line 2 graph
2
3 2
1 3
2 3
4 4
1 2
2 3
3 4
4 2 
*/

}
