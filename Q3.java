package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program which can store List of Integer values and print all the
		// values using for iterator
		ArrayList<Integer> ar = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

		Iterator<Integer> it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
