package com.kyhome.samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Expert1859 {
	static int total;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < testcase; i++) {
			sb.append("#" + (i+1) + " ");
			total = 0;
			int n = Integer.parseInt(bf.readLine());
			String input[] = bf.readLine().split(" ");
			int map[] = new int[n];
			for (int j = 0; j < map.length; j++) {
				map[j] = Integer.parseInt(input[j]);
			}
			func(0, 0, false, 0, n, map);
			sb.append(total + "\n");
		}
		System.out.println(sb.toString());
	}

	public static void func(int index, int count, boolean state, int money, int n, int map[]) {
		// 파는 금액 측정
		if (state) {
			if (count == 0) {				
				total = total > money ? total : money;
				return;
			}
			money += (count * map[index]);
			count = 0;
		} else {
			
			// 사는 금액 측정
			money -= map[index];
			count += 1;
		}
		if (index + 1 == n) {
			// System.out.println("money : " + money);
			total = total > money ? total : money;
			return;
		}
		
		// 산다
		if (index+1 != n) {
			
			func(index + 1, count, false, money, n, map);
		}

		// 판다
		func(index + 1, count, true, money, n, map);
		return;
	}
}