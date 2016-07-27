package chapter4_abstract;

public abstract class B {
	private int a;

	public B(int a) {
		this.a = a;
	}

	public B() {
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
