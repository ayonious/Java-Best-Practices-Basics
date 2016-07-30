package chapter31.inheritance;

public class A {
	private int a, b, c;

	public A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public A() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}

	public A(int a) {
		this.a = a;
		this.b = a;
		this.c = a;
	}

	public int vol() {
		return a * b * c;
	}

	public void set(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
