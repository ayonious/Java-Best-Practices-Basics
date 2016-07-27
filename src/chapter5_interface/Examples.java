package chapter5_interface;

/*

lets assume that the idea of interface is 
same as abstract now I shall find the differences
and put comments there

*/

public class Examples {
	void example1() {
		A a;
		A1 a1 = new A1();
		a = a1;

		a.printA();
		// same as abstract
	}

	public void start() {
		example1();
	}
}
