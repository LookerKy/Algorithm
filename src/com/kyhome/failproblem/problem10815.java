package com.kyhome.failproblem;

import java.util.*;
import java.io.*;

public class problem10815 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        @SuppressWarnings("unused")
		int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        HashSet<Integer> d = new HashSet<Integer>();
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            d.add(num);
        }
        @SuppressWarnings("unused")
		int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (d.contains(num)) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.println(sb);
    }
}