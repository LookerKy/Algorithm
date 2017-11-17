package com.kyhome.KaKao;


import java.util.HashMap;
import java.util.Iterator;

public class KakaoPrac1 {
	public static void main(String[] args) {
		int [][] v = {{100000,300000},{5000000,300000},{5000000,2000000}};
		int difx =0;
		int dify =0;
		HashMap<Integer, Integer> mapX = new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> mapY = new HashMap<Integer,Integer>();
		for(int x =0; x<3; x++) {
			if(mapX.containsKey(v[x][0])==false) {
				mapX.put(v[x][0], 1);
			}else {
				mapX.put(v[x][0], mapX.get(v[x][0])+1);
			}
		}
		Iterator<Integer> iteratorX = mapX.keySet().iterator();
		while(iteratorX.hasNext()) {
			int key = iteratorX.next();
			if(mapX.get(key) ==1) {
				difx=key;
			}
		}
		for(int y =0; y<3; y++) {
			if(mapY.containsKey(v[y][1])==false) {
				mapY.put(v[y][1], 1);
			}else {
				mapY.put(v[y][1], mapY.get(v[y][1])+1);
			}
		}
		Iterator<Integer> iteratorY = mapY.keySet().iterator();
		while(iteratorY.hasNext()) {
			int key = iteratorY.next();
			if(mapY.get(key) ==1) {
				dify=key;
			}
		}
		System.out.println(difx + " " + dify);
	}
}
