package chapter62_STL.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Main prog = new Main();
		// prog.example1_TreeMap();
		// prog.example2_HashMap();
		prog.example3_LinkedHashMap();
	}

	// materials for example 1
	void example1_TreeMap() {
		Map<Integer, String> map = new TreeMap<Integer, String>();

		map.put(1, "something1");
		map.put(4, "something4");
		map.put(3, "something3");
		map.put(100, "something100");
		map.put(-1, "something-1");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " has the value: " + entry.getValue());
		}
	}

	// materials for example 2
	void example2_HashMap() {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "something1");
		map.put(4, "something4");
		map.put(3, "something3");
		map.put(100, "something100");
		map.put(-1, "something-1");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " has the value: " + entry.getValue());
		}
	}

	// materials for example 3
	/*
	 * Hash table and linked list implementation of the Map interface, with
	 * predictable iteration order. This implementation differs from HashMap in
	 * that it maintains a doubly-linked list running through all of its
	 * entries. This linked list defines the iteration ordering, which is
	 * normally the order in which keys were inserted into the map
	 * (insertion-order).
	 */
	void example3_LinkedHashMap() {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(1, "something1");
		map.put(4, "something4");
		map.put(4, "something4again");
		map.put(3, "something3");
		map.put(100, "something100");
		map.put(-1, "something-1");

		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " has the value: " + entry.getValue());
		}
		/*
		1 has the value: something1
		4 has the value: something4again
		3 has the value: something3
		100 has the value: something100
		-1 has the value: something-1
		*/
	}

	// materials for example 4
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

	class Val {
		int k;

		Val(int i) {
			k = i;
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

	void example4_comparator() {
		Comparator<Key> c1 = new cmp();

		// no point in using a hashmap with a comparator
		// because hash map is not ordered
		Map<Key, Val> map = new TreeMap<Key, Val>(c1);

		for (int i = 0; i <= 10; i++) {
			Key k = new Key(i);
			Val v = new Val(2 * i);
			map.put(k, v);
		}

		Key k = new Key(4);
		Val v = map.get(k);
		System.out.println(v.k);

		// traverse all the values
		for (Val val : map.values()) {
			System.out.println(val.k);
		}
		System.out.println("");

		// traversing all the key value pairs
		for (Key key : map.keySet()) {
			Val val = map.get(key);
			System.out.println(key.a + " " + val.k);
			// do something to value
		}

		// traversing all the key value pairs
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Key, Val> entry = (Entry<Key, Val>) it.next();
			System.out.println(entry.getKey().a + " has the value: " + entry.getValue().k);
		}
	}
}
