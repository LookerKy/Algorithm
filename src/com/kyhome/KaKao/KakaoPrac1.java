package com.kyhome.KaKao;

import java.util.HashMap;
import java.util.Iterator;

public class KakaoPrac1 {
	public static void main(String[] args) {
		int [] a = {1000000,3000000,3000000};
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<3; i++) {
			if(map.containsKey(a[i]) == false) {
				map.put(a[i],1);
			}else {
				map.put(a[i], map.get(a[i])+1);
			}
		}
		Iterator<Integer> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			System.out.println("key =" + key);
			System.out.println("value= "+map.get(key));
		}
		
	}
}
