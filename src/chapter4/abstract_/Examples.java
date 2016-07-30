package chapter4.abstract_;

/*
the idea of abstract class can be seen very clearly if you browse 
all the class files of this program 
*/

/*

  /------>A2*------>A21
 /
A*------->A1
 \
  \------>A3---->A31*---->A32---->A33*---->A34
   \
    \---->A4*--->A41--->A411
*/

public class Examples {
	void example1() {
		// you cant write this line
		// you cant take an object of abstract class
		// A a=new A();

		// but this can be done
		A2 a2;

	}

	void example2() {

		A a;
		A4 a4;
		A41 a41 = new A41();

		// without A41 this will not work
		a4 = a41;
		a = a4;

		System.out.println(a.vol());

	}

	// no problems with overriding
	void example3() {

		A a;
		A4 a4;
		A41 a41 = new A41();
		A411 a411 = new A411();

		// without A41 this will not work
		a4 = a411;
		a = a4;

		System.out.println(a.vol());

	}

	public void start() {
		// example1();
		// example2();
		example3();

	}

}
