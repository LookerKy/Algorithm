package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


/*연결요소 찾기*/
public class Problem11724 {
	private ArrayList<ArrayList<Integer>> list ;
	private boolean check[] ;
	public static void main(String[] args) throws IOException {
		Problem11724 p = new Problem11724();
		p.graph();
	}
	public void graph() throws IOException {
		list = new ArrayList<ArrayList<Integer>>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(input1[0]);
		int m = Integer.parseInt(input1[1]);
		for(int i=0; i<=n; i++) {
			ArrayList<Integer> map = new ArrayList<Integer>();
			list.add(map);
		}
		for(int i=1;i<=m; i++) {
			String input2[] = bf.readLine().split(" ");
			int u = Integer.parseInt(input2[0]);
			int v = Integer.parseInt(input2[1]);
			list.get(u).add(v);
			list.get(v).add(u);
		}
		for(int i=0; i<=n; i++) {
			Collections.sort(list.get(i));
		}
		check = new boolean[n+1];
		int component = 0;
		for(int i=1; i<=n; i++) {
			if(check[i] == false) {
				dfs(i);
				component +=1;
			}
		}
		System.out.println(component);
	}
	public void dfs(int node) {
		check[node] = true;
		
		for(int i=0; i<list.get(node).size();i++) {
			int next = list.get(node).get(i);
			if(check[next] == false) {
				dfs(next);
			}
		}
	}
	
}
