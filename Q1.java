package assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program which can store List of Integer values and print all the
		// values using for loop.

		ArrayList<Integer> ar = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

	}

}
