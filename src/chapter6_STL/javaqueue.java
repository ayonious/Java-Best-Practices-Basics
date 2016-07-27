package chapter6_STL;

import java.io.*;
import java.util.*;

public class javaqueue {

	class my {
		// this will be public
		int a;

		my(int k) {
			a = k;
		}

		int get() {
			return a;
		}
	}

	/*
	 * public static void main (String[] args) { javaqueue prog=new javaqueue();
	 * prog.run(); }
	 */
	void run() {

		/*
		 * Queue queueA = new LinkedList();
		 * 
		 * queueA.add("element 0"); queueA.add("element 1");
		 * queueA.add("element 2");
		 * 
		 * //access via Iterator Iterator iterator = queueA.iterator();
		 * while(iterator.hasNext()) { String element = (String)
		 * iterator.next(); System.out.println(element); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //this can be used for the bfs while(queueA.isEmpty()==false) { //get
		 * the head Object o=queueA.element(); //remove the head
		 * queueA.remove(); String s=(String)o; System.out.println(s); }
		 */

		/*
		 * Queue<my> q = new LinkedList<my>();
		 * 
		 * my m=new my(10); q.add(m); // careful about this. always make a new
		 * item to push. its a pointer m=new my(11); q.add(m);
		 * 
		 * 
		 * while(q.isEmpty()==false) { m=q.element(); q.remove();
		 * System.out.println(m.a); }
		 */

	}
}
