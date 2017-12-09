package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class DFS {
	/*
	 * 목적 : 모든 정점을 1번씩 방문 최대한 깊숙히(Stack)
	 */
	public ArrayList<ArrayList<Integer>> list;
	public boolean check[];

	public static void main(String[] args) throws IOException {
		// check 라는 배열 필요 0 또는 1로 표시 번호가 작은거 부터 방문하는 방식
		DFS dfs = new DFS();
		dfs.adjacencyList();
	}

	/* 인접 리스트 */
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
		System.out.println("탐색된 노드 : " + x);
		for (int i = 0; i < list.get(x).size(); i++) {
			int y = list.get(x).get(i);
			if (check[y] == false) {
				dfs(y);
			}
		}
	}

}
