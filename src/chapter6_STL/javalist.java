package chapter6_STL;

import java.io.*;
import java.util.*;
import java.util.Comparator;

public class javalist {
	/*
	 * public static void main (String[] args) { javalist prog=new javalist();
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

	void run() {
		my m = new my(1);
		my n = new my("goto hell");

		List<my> s = new ArrayList<my>();

		int i;
		for (i = 0; i <= 10; i++) {
			n = new my(i);
			s.add(n);
		}

		for (i = 0; i < 5; i++) {
			n = s.get(i + 3);
			System.out.println(n.a);
		}

	}
}
