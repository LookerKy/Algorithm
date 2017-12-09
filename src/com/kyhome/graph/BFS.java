package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	/*목적: 모든 정점을 한번씩 방문
	 * 최대한 넓게(Queue)
	 * 모든 간선의 가중치가 1일 때 최단거리 찾는 알고리즘*/
	private ArrayList<ArrayList<Integer>> list;
	private boolean check[] = new boolean[1001];
	public static void main(String[] args)throws IOException {
		BFS bfs = new BFS();
		bfs.adjacencyList();
	}
	public void adjacencyList() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<ArrayList<Integer>>();
		String input1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		for(int i=0; i<=n; i++) {
			ArrayList<Integer> map = new ArrayList<Integer>();
			list.add(map);
		}
		for(int i=1; i<=m; i++) {
			String input2[] = bf.readLine().split(" ");
			int u = Integer.parseInt(input2[0]);
			int v = Integer.parseInt(input2[1]);
			list.get(u).add(v); 
			list.get(v).add(u);
		}
		for(int i=1;i<=n; i++) {
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
		System.out.println();
		bfs(1);
	}
	public void bfs(int node) {
		Queue<Integer> q = new LinkedList<Integer>();
		check[node] = true;
		q.offer(node);
		while(!q.isEmpty()) {
			int n =q.peek();
			q.poll();
			System.out.println("현재노드 : "+ n);
			for(int i=0; i<list.get(n).size(); i++) {
				int next = list.get(n).get(i);
				if(check[next] == false) {
					check[next] = true;
					q.offer(next);
				}
			}
		}
	}
}
