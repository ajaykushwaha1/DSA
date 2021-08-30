package com.dsa.array.operations;

import java.util.Scanner;

/**
 * This class contains various methods for manipulating arrays (such as
 * insertion and detetion). This class also contains a static factory that
 * allows to get instance of class.
 *
 * @author Ajay Kushwaha
 * @since 1.0
 */
public class ArrayInsertion {

	private ArrayInsertion() {
	}

	public static class ArrayInsertionhaldler {
		private static final ArrayInsertion INSTANCE = new ArrayInsertion();
	}

	public static ArrayInsertion getInstance() {
		return ArrayInsertionhaldler.INSTANCE;
	}

	/**
	 * <p>
	 * This method is used to declare array of Integer. The methods throw a
	 * {@code NegativeArraySizeException}, if the specified array size is negative
	 * number.
	 * </p>
	 */
	public Integer[] create(Integer size) {
		return new Integer[size];
	}

	public Integer[] insert(Scanner sc, Integer[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		return a;
	}

	public Integer[] insert(Scanner sc, Integer size) {
		Integer[] a = create(size);
		for (int i = 0; i < size; i++)
			a[i] = sc.nextInt();
		return a;
	}

	public Integer[] delete(Integer[] a, Integer key) {
		int j = 0;
		Integer[] b = new Integer[a.length - 1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] != key) {
				b[j] = a[i];
				j++;
			}
		}

		return b;
	}

}
