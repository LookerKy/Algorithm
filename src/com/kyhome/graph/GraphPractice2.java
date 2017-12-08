package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*��������Ʈ*/
public class GraphPractice2 {
	ArrayList<Integer>[] list ;
	public static void main(String[] args) throws Exception {

		adjacencyList();

	}

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
	  */
}
