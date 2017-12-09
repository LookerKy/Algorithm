package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*bfs dfs ±¸Çö*/
public class Problem1260 {
	ArrayList<ArrayList<Integer>> list;
	boolean check[];
	StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		Problem1260 p = new Problem1260();
		
		try {
			p.graph();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void graph() throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<ArrayList<Integer>>();
		String input1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		int start = Integer.parseInt(input1[2]);
		for(int i=0; i<=n; i++) {
			ArrayList<Integer> map = new ArrayList<Integer>();
			list.add(map);
		}
		for(int i=1; i<=m; i++) {
			String input2[]  = bf.readLine().split(" ");
			int u = Integer.parseInt(input2[0]);
			int v = Integer.parseInt(input2[1]);
			list.get(u).add(v);
			list.get(v).add(u);
		}
		for(int i=1; i<=n; i++) {
			Collections.sort(list.get(i));
		}
		check = new boolean[n+1];
		dfs(start);
		System.out.println(sb.toString());
		sb.setLength(0);
		Arrays.fill(check, false);
		bfs(start);
		System.out.println(sb.toString());
		
	}
	public void dfs(int node) {
		check[node] = true;
		sb.append(node +" ");
		for(int i=0; i<list.get(node).size(); i++) {
			int next = list.get(node).get(i);
			if(check[next] == false) {
				dfs(next);
			}
		}
	}
	public void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		check[start] = true;
		while(!q.isEmpty()) {
			int node = q.peek();
			q.poll();
			sb.append(node + " ");
			for(int i=0; i<list.get(node).size();i++) {
				int next = list.get(node).get(i);
				if(check[next]==false) {
					check[next] = true;
					q.offer(next);
				}
			}
		}
		
	}
}
