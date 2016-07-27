package chapter3_inheritance_dynamic_method_dispatch;

public class A11 extends A1 {
	private int randomshit;

	public A11(int a, int b, int c, int w, int shit) {
		// super will always call the immidiate parent
		super(a, b, c, w);
		this.randomshit = shit;
	}

	public void show() {
		System.out.println("show in A11");
	}

}
