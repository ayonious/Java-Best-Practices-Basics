package chapter62_STL.map;

import java.io.*;
import java.util.*;
import java.util.Comparator;

public class Main {
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

	public static void main (String[] args) { 
		Main prog=new Main();
		prog.example2_linkedlist();
		//prog.example1_arraylist();
	}
	

	void example1_arraylist() {
		List<String> names = new ArrayList<String>(3); // 3 because we expect the list 
		    // to have 3 entries.  If we didn't know how many entries we expected, we
		    // could leave this empty
		names.add("Alice");
		names.add("Bob");
		names.add("Charlie");
		System.out.println(names.get(2)); // prints "Charlie"
		System.out.println(names); // prints the whole list
		for (String name: names) {
		    System.out.println(name);  // prints the names in turn.
		}
	}
	
	void example2_linkedlist() {
		/* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList<String>();

        /*add(String Element) is used for adding 
         * the elements to the linked list*/
        linkedlist.add("Item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

        /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedlist);

        /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

        /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist); 
	}
}
