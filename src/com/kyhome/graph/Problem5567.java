package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem5567 {

	/*
	 * ���� : ��� ������ 1���� �湮 �ִ��� �����(Stack)
	 */
	public ArrayList<ArrayList<Integer>> list;
	public boolean check[];

	public static void main(String[] args) throws IOException {
		// check ��� �迭 �ʿ� 0 �Ǵ� 1�� ǥ�� ��ȣ�� ������ ���� �湮�ϴ� ���
		Problem5567 dfs = new Problem5567();
		dfs.adjacencyList();
	}

	/* ���� ����Ʈ */
	public void adjacencyList() throws IOException {
		list = new ArrayList<ArrayList<Integer>>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int m = Integer.parseInt(bf.readLine());
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

		int deapth = 0;
		int cnt = 0;
		check = new boolean[n + 1];
		dfs(1, deapth);
		for(int i=2; i<check.length; i++) {
			if(check[i] == true)
				cnt++;
		}
		System.out.println(cnt);
	}

	/* dfs */
	public void dfs(int node, int deapth) {
		deapth += 1;
		if(deapth == 5) {
			return;
		}
		check[node] = true;
		System.out.println("Ž���� ��� : " + node);
		for (int i = 0; i < list.get(node).size(); i++) {
			
				int next = list.get(node).get(i);
				if (check[next] == false) {
					dfs(next, deapth);
				
			}
		}
	}

}
