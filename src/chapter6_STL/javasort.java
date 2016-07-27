package chapter6_STL;

import java.io.*;
import java.util.*;

public class javasort {
	/*
	 * public static void main(String arg[]) { javasort prog=new javasort();
	 * prog.run(); }
	 */

	class point {

		int x, y;

		point(int a, int b) {
			x = a;
			y = b;
		}
	}

	class cmp implements Comparator<point> {
		@Override
		public int compare(point a, point b) {
			if (a.x == b.x) {
				if (a.y == b.y)
					return 0;
				else if (a.y > b.y)
					return 1;
				else
					return -1;
			} else if (a.x > b.x)
				return 1;
			else
				return -1;
		}
	}

	void run() {
		Comparator<point> c1 = new cmp();

		point p[] = new point[20];
		int i;

		for (i = 0; i < 20; i++) {
			p[i] = new point((i * 7) % 6, (i * 3) % 4);
		}

		for (i = 0; i < 20; i++) {
			System.out.println(p[i].x + " " + p[i].y);
		}
		System.out.println("");

		Arrays.sort(p, 0, 10, c1);

		for (i = 0; i < 20; i++) {
			System.out.println(p[i].x + " " + p[i].y);
		}

	}
}
