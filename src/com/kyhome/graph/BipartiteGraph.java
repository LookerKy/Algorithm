package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//Problem1707(�̺� �׷���)
public class BipartiteGraph {
	/*
	 * �׷����� A�� B�� ���� �� ������ �̺� �׷������ �Ѵ�. A�� ���ԵǾ� �ִ� �������� ����Ǿ��ִ� �����̾���. B�� ���ԵǾ� �ִ�
	 * �������� ����Ǿ��ִ� �����̾���. ��� ������ �� �� ���� A��, �ٸ� �� ���� B�� �̺� �׷������� check[]�� �ǹ̰� �ٸ���
	 * ���δ�. 1 �϶� �湮�߰� ������(A�׷���) 2 �϶� �湮�߰� ������(B�׷���)
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
