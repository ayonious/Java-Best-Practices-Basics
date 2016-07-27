package chapter7_generics_class;

public class Example2 {
	public static void main(String args[]) {
		Box<Integer> b = new Box<Integer>(10);
		System.out.println(b.get());

		Box<String> b1 = new Box<String>("something");
		System.out.println(b1.get());
	}
}
