package chapter72.generics_method;

public class Example1 {
	public static <E> void printArr(E[] array) {
		for (E element : array) {
			System.out.println(element);
		}
	}

	public static void array_example1() {
		String[] s = new String[10];
		for (int i = 0; i < 10; i++) {
			s[i] = "something";
		}
		printArr(s);
	}

	public static void array_example2() {
		// this is error because this is primitive type
		// int[] arr = new int[10];

		// this is okay
		Integer[] arr = new Integer[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		printArr(arr);
	}

	public static void main(String args[]) {
		// array_example1();
		// array_example2();
	}
}