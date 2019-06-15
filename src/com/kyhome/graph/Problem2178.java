package com.kyhome.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2178 {
	int N;
	int M;
	int map[][];
	int result;
	boolean visited[][];
	class Point {
		int x, y, count;
		Point(int x, int y, int count){
			this.x = x;
			this.y = y;
			this.count = count;
		}
	}
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		map = new int[N+1][M+1];
		visited = new boolean[N+1][M+1];
		for(int i=1; i<N+1; i++) {
			String tempMap = br.readLine();
			for(int j=1; j<M+1; j++) {
				map[i][j] = tempMap.charAt(j-1) - 48;
//				System.out.print(map[i][j]);
			}
//			System.out.println();
		}
		search();
		System.out.println(result);
	}
	public void search() {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(1,1,1));
		visited[1][1] = true;
		int mx[] = {0,0,1,-1};
		int my[] = {1,-1,0,0};
		while(!q.isEmpty()) {
			Point p = q.poll();
			int x = p.x;
			int y = p.y;
			int count = p.count;
			if(x == N && y == M) {
				result = count;
				return;
			}
			for(int i=0; i<4; i++) {
				int move_x = x + mx[i];
				int move_y = y + my[i];
				
				if(move_x >= 1 && move_y >=1 && move_x <= N && move_y <= M && map[move_x][move_y] == 1 && visited[move_x][move_y] == false) {
					q.add(new Point(move_x, move_y, count+1));
					visited[move_x][move_y]= true;
				}
			}
			
		}
	}
	
	public static void main(String[] args) throws IOException{
		new Problem2178().input();
//		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(1);
//		queue.add(3);
//		while(!queue.isEmpty()) {
//			int ad = queue.poll();
//			System.out.println(ad);
//		}
	}
}
