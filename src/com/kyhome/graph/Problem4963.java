package com.kyhome.graph;


import java.io.IOException;

public class Problem4963 {
	public static int vertex[];
	public static int size[];
	
	public static void main(String[] args)throws IOException {
		

	}
	public static int find(int a) {
		if(vertex[a] == a) {
			return a;
		}
		return vertex[a] = find(vertex[a]);
	}
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) {
			if(size[a] <= size[b]) {
				vertex[a] = b;
				size[b] += size[a];
			}else {
				vertex[b] = a;
				size[a] += size[b];
			}
		}
	}
}
