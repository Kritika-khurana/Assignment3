package assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 {
	// Write a program which will print sum of all numbers which is stored in list.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program which will print sum of all numbers which is stored in list.

		ArrayList<Integer> ar = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 17, 9, 10, 11, 12, 13, 14, 15));
		int k = 0;
		for (int i = 0; i < ar.size(); i++) {
			// System.out.println(ar.get(i));
			k = k + ar.get(i);

		}
		System.out.println(k);
	}

}
