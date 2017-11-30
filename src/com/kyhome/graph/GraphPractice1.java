package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphPractice1 {
	public static void main(String[] args)throws IOException {
		//adjacencyMatrix();
		weightadjacencyMatrix();
	}
	/*************인접행렬****************/
	public static void adjacencyMatrix() throws IOException {
		String s[] = new String [2];
		int n,m;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		s = bf.readLine().split(" ");
		n=Integer.parseInt(s[0]);//노드의 갯수
		m=Integer.parseInt(s[1]);//간선의 갯수
		int a[][] = new int[n+1][n+1];
		for(int i=0; i<m;i++) {
			int u,v;//연결된 간선 노드 번호
			s = bf.readLine().split(" ");
			u = Integer.parseInt(s[0]);
			v = Integer.parseInt(s[1]);
			a[u][v]=a[v][u] =1;
			
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		
	}
	/**************가중치가 있는 인접행렬***************/
	public static void weightadjacencyMatrix()throws IOException {
		String s[] = new String [3];
		int n,m;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		s = bf.readLine().split(" ");
		n=Integer.parseInt(s[0]);//노드의 갯수
		m=Integer.parseInt(s[1]);//간선의 갯수
		int a[][] = new int[n+1][n+1];
		for(int i=0; i<m;i++) {
			int u,v,w;//연결된 간선 노드 번호 및 가중치
			s = bf.readLine().split(" ");
			u = Integer.parseInt(s[0]);
			v = Integer.parseInt(s[1]);
			w = Integer.parseInt(s[2]);
			a[u][v]=a[v][u] =w;
			
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
		
	}
}
