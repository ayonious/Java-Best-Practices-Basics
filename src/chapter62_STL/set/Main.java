package chapter62_STL.set;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Main prog = new Main();
		
		// prog.example1_TreeMap();
		// prog.example2_HashSet();
		// prog.example3_comparator();
	}

	// materials for example 1
	void example1_TreeSet() {
		Set<String> set = new TreeSet<String>();

		set.add("something1");
		set.add("something4");
		set.add("something3");
		set.add("something100");
		set.add("something-1");

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " has the value: " + entry.getValue());
		}
	}

	// materials for example 2
	void example2_HashSet() {
		Set<String> set = new HashSet<String>();

		set.add("something1");
		set.add("something4");
		set.add("something3");
		set.add("something100");
		set.add("something-1");

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " has the value: " + entry.getValue());
		}
	}

	// materials for example 3
	class Key {
		int a;
		String s;

		Key(String st, int i) {
			s = st;
			a = i;
		}

		Key(int i) {
			s = "nothing here :P";
			a = i;
		}

		Key(String st) {
			s = st;
			a = 0;
		}
	}

	class cmp implements Comparator<Key> {
		@Override
		public int compare(Key x, Key y) {
			// 3 ta line e lagbe
			if (x.a > y.a)
				return 1;
			if (x.a < y.a)
				return -1;
			else
				return 0;
		}
	}

	void example3_comparator() {
		Comparator<Key> c1 = new cmp();

		//no point in using a hashmap with a comparator
		//because hash map is not ordered
		Set<Key> set = new TreeSet<Key>(c1);

		for (int i = 0; i <= 10; i++) {
			Key k = new Key(i);
			set.add(k);
		}
		
		Iterator<Key> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("");
	}
}
