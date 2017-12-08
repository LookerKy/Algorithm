package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*인접리스트*/
public class GraphPractice2 {
	ArrayList<Integer>[] list ;
	public static void main(String[] args) throws Exception {

		adjacencyList();

	}

	public static void adjacencyList() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String graph[] = bf.readLine().split(" ");
		int n = Integer.parseInt(graph[0]); //노드의 수
		int m = Integer.parseInt(graph[1]); //간선의 수 
		ArrayList<Integer>[] a = new ArrayList [n + 1];
		for(int i=1; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= m; i++) {
			String input[] = bf.readLine().split(" ");
			int u = Integer.parseInt(input[0]);//연결된 간선(노드 번호)
			int v = Integer.parseInt(input[1]);//연결된 간선(노드 번호)
			a[u].add(v);
			a[v].add(u);
		}
		for (int i = 1; i <= n; i++) {
			Collections.sort(a[i]);
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			sb.append("#"+i+" ");
			for(int j =0; j<a[i].size();j++) {
				sb.append(a[i].get(j)+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	
	/*참고! 간선 리스트: Collection을 사용할 수 없는 경우 
	 배열을 이용하여 저장한다. 
	 양방향의 경우 int E[간선의 총 갯수][2(연결된 노드  번호)] 라는 배열에  저장하는데 
	 시작 정점을 기준으로 정렬한다.
	 input
6 8
1 2
1 5
2 3
2 4
2 5
5 4
4 3
4 6
	  */
}
