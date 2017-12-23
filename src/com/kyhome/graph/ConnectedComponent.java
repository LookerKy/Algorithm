package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Connected Component <- ���⼺�� ���� �׷����� ��, ����� ��� ������ ã������ UnionFind ���
//Union �Լ����� a = find(a); �� �޾Ƽ� ��, ��Ʈ ���ҷ� ����� ���ϰ�, �ٿ����Ѵ�.
public class ConnectedComponent {
	static int[] root;
	static int[] size;
	
	private static int find(int a) {
		if(root[a]==a){
			return a;
		}
		return root[a] = find(root[a]);
	}
	
	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b){
			if(size[a] <= size[b]){
				root[a] = b ;  
				size[b] += size[a];
			}else{
				root[b] = a;
				size[a] += size[b];
			}
			for(int i = 1; i<root.length; i++) {
				System.out.print("root: "+ root[i] + " ");
			}
			System.out.println("");
			for(int i = 1; i<root.length; i++) {
				System.out.print("size: "+size[i] + " ");
			}
			System.out.println("");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		root = new int[N+1];
		size = new int[N+1];
		for (int i = 1; i <=N; i++) {
			root[i] = i;
			size[i] = 1;
		}		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			union(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
		}
		
		int cnt = 0;
		for (int i = 1; i <=N; i++) {
			if(root[i] == i){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

