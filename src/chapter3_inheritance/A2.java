package chapter3_inheritance;

public class A2 extends A {
	private int weight;

	public A2(int a, int b, int c, int w) {
		super(a, b, c);
		this.weight = w;
	}

	public void set(int a, int b, int c, int w) {
		set(a, b, c);
		this.weight = w;
	}

	public void show_weight() {
		System.out.println(weight);
	}

}
