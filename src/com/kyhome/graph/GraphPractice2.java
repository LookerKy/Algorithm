package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeMap;

/*��������Ʈ*/
public class GraphPractice2 {
	ArrayList<Integer>[] list ;
	public static void main(String[] args) throws Exception {

		adjacencyList();
		addAdjacencyList();
	}
	
	/*����ġ�� ���� ��������Ʈ*/
	public static void adjacencyList() throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String graph[] = bf.readLine().split(" ");
		int n = Integer.parseInt(graph[0]); //����� ��
		int m = Integer.parseInt(graph[1]); //������ �� 
		ArrayList<Integer>[] a = new ArrayList [n + 1];
		for(int i=1; i<=n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= m; i++) {
			String input[] = bf.readLine().split(" ");
			int u = Integer.parseInt(input[0]);//����� ����(��� ��ȣ)
			int v = Integer.parseInt(input[1]);//����� ����(��� ��ȣ)
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
	/*������ ����ġ ��������Ʈ*/
	public static void addAdjacencyList() throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<TreeMap<Integer, Integer>> list = new ArrayList<TreeMap<Integer,Integer>>();
		for(int i=0; i<=n; i++) {
			TreeMap<Integer, Integer> input = new TreeMap<Integer,Integer>();
			list.add(input);
		}
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(bf.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			list.get(u).put(v,a);
			list.get(v).put(u,a);
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=n; i++){
			sb.append("#"+i+" ");
			for(int key : list.get(i).keySet()) {
				sb.append("("+key+","+list.get(i).get(key)+") ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
	
	/*����! ���� ����Ʈ: Collection�� ����� �� ���� ��� 
	 �迭�� �̿��Ͽ� �����Ѵ�. 
	 ������� ��� int E[������ �� ����][2(����� ���  ��ȣ)] ��� �迭��  �����ϴµ� 
	 ���� ������ �������� �����Ѵ�.
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

6 7 
1 2 1
1 5 3
2 3 8
2 5 7
5 4 12
4 3 15
4 6 9
	  */
}
