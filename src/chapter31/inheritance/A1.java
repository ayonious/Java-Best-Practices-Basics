package chapter31.inheritance;

public class A1 extends A {
	private int color;

	public A1(int a, int b, int c, int col) {
		super(a, b, c);
		this.color = col;
	}

	public void set(int a, int b, int c, int col) {
		set(a, b, c);
		this.color = col;
	}

	public void show_color() {
		System.out.println(color);
	}
}
