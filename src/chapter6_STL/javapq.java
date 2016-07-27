package chapter6_STL;

import java.io.*;
import java.util.*;
import java.util.Comparator;

public class javapq {
	/*
	 * public static void main (String[] args) { javapq prog=new javapq();
	 * prog.run(); }
	 */

	class my {
		int a;
		String s;

		my(String st, int i) {
			s = st;
			a = i;
		}

		my(int i) {
			s = "nothing here :P";
			a = i;
		}

		my(String st) {
			s = st;
			a = 0;
		}

		int gcd(int x, int y) {
			if (x == 0)
				return y;
			else
				return gcd(y, x % y);
		}
	}

	class cmp implements Comparator<my> {
		@Override
		public int compare(my x, my y) {

			// 3 ta line e lagbe
			if (x.a > y.a)
				return 1;
			if (x.a < y.a)
				return -1;
			else
				return 0;

		}
	}

	void run() {
		// System.out.println("sdf");
		my m = new my(1);
		my n = new my("goto hell");

		Comparator<my> c1 = new cmp();
		// initial size,comparator
		PriorityQueue<my> pq = new PriorityQueue<my>(5, c1);

		int i;

		for (i = 0; i <= 10; i++) {
			n = new my(i);
			pq.add(n);

		}
		// System.out.println("sdf");

		// System.out.println(pq.size());
		while (pq.isEmpty() == false) {

			n = pq.remove();
			System.out.println(n.a);
			// System.out.println("sz is:"+pq.size());

		}

	}
}
