package chapter31.inheritance;

/*

	 /-------->A2------->A21
   A/
	\
	 \------->A1


*/

public class Examples {
	void example1() {
		A b = new A(2, 3, 4);
		A1 bc = new A1(2, 3, 4, 0);
		A2 bw = new A2(2, 3, 4, 10);

		System.out.println(bc.vol());
		bc.set(1, 1, 1, 10);
		System.out.println(bc.vol());

	}

	// a superclass can refer to its subclass
	// but the opposite is not true
	// there is an exception to this rule. see
	// 'chapter3_inheritance_dynamic_method_dispatch'
	void example2() {
		A b = new A(2, 3, 4);
		A1 bc1, bc = new A1(2, 3, 4, 10);
		;
		A2 bw = new A2(2, 3, 4, 10);

		// this is not possible
		// ColorBox bc=b;

		// but this is possible
		b = bc;

		// this is not possible
		// because superclass have no idea of what its subclasses are doing
		// b.show_color();

	}

	void example3() {
		A21 bwc = new A21(2, 3, 4, 10, 123123);

		bwc.set(1, 2, 3, 4, 5);

		// should this call the set from 'WeightBox'?
		// or the method was overridden by 'WeightBoxChild'
		bwc.set(1, 2, 3, 4);

	}

	public void start() {
		example1();
		// example2();
		// example3();

	}

}
