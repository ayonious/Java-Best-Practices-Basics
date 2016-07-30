package chapter4.method_overriding;

//A------->A1

public class Examples {
	void example1() {
		A a;
		A1 a1 = new A1();
		a = a1;

		// so methods can be overridden in java with no problem
		// in c this is not possible
		System.out.println(a.get());

	}

	public void start() {
		example1();
	}

}
