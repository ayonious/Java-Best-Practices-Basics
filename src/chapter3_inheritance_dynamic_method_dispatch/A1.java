package chapter3_inheritance_dynamic_method_dispatch;

public class A1 extends A {
	private int weight;

	public A1(int a, int b, int c, int w) {
		super(a, b, c);
		this.weight = w;
	}

	public void show() {
		System.out.println("show in A1");
	}

}
