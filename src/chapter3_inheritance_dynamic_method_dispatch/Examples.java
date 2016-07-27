package chapter3_inheritance_dynamic_method_dispatch;

/*

A------->A1------->A11

*/

public class Examples {
	void example1() {
		A a = new A(2, 3, 4);
		A1 a1 = new A1(2, 3, 4, 10);
		A11 a11 = new A11(2, 3, 4, 10, 10);

		// you will not see the method used in A1
		a = a1;
		a.show();

		// method overrider in 'A11' will be used here
		a = a11;
		a.show();
	}

	public void start() {
		example1();
	}
}
