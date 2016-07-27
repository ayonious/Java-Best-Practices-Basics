package chapter4_abstract;

public abstract class A {
	private int a;

	public A(int a) {
		this.a = a;
	}

	public A() {
		this.a = 1;
	}

	public abstract int vol();

	public int get() {
		return a;
	}

	public void set(int a) {
		this.a = a;
	}

}
