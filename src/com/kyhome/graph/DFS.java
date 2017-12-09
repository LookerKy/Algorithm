package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DFS {
	/*
	 * ���� : ��� ������ 1���� �湮 �ִ��� �����(Stack)
	 */
	public ArrayList<ArrayList<Integer>> list;
	public boolean check[];

	public static void main(String[] args) throws IOException {
		// check ��� �迭 �ʿ� 0 �Ǵ� 1�� ǥ�� ��ȣ�� ������ ���� �湮�ϴ� ���
		DFS dfs = new DFS();
		dfs.adjacencyList();
	}

	/* ���� ����Ʈ */
	public void adjacencyList() throws IOException {
		list = new ArrayList<ArrayList<Integer>>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		for (int i = 0; i <= n; i++) {
			ArrayList<Integer> map = new ArrayList<Integer>();
			list.add(map);
		}
		for (int i = 1; i <= m; i++) {
			String input2[] = bf.readLine().split(" ");
			int u = Integer.parseInt(input2[0]);
			int v = Integer.parseInt(input2[1]);
			list.get(u).add(v);
			list.get(v).add(u);

		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(list.get(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			sb.append("#" + i + " ");
			for (int j = 0; j < list.get(i).size(); j++) {
				sb.append(list.get(i).get(j) + " ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		check = new boolean[n + 1];
		dfs(1);
	}

	/* dfs */
	public void dfs(int x) {
		check[x] = true;
		System.out.println("Ž���� ��� : " + x);
		for (int i = 0; i < list.get(x).size(); i++) {
			int y = list.get(x).get(i);
			if (check[y] == false) {
				dfs(y);
			}
		}
	}

}
