package chapter3_multiple_inheritance_not_supported;

public class A {
	private int a;

	public A(int a) {
		this.a = a;
	}

	public A() {
		this.a = 1;
	}

	public int vol() {
		return a;
	}

	public void set(int a) {
		this.a = a;
	}
}
