package chapter7_generics_class;

public class Box<T> {
	private T a;

	Box(T t) {
		this.a = t;
	}

	public void set(T t) {
		this.a = t;
	}

	public T get() {
		return this.a;
	}
}