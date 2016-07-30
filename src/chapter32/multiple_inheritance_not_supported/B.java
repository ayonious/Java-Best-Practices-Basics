package chapter32.multiple_inheritance_not_supported;

public class B {
	private int b;

	public B(int b) {
		this.b = b;
	}

	public B() {
		this.b = 1;
	}

	public int vol() {
		return b;
	}

	public void set(int b) {
		this.b = b;
	}
}
