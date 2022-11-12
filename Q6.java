package assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a list of numbers 33,44,55,66,77,88

		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(33, 44, 55, 66, 77, 88));
		System.out.println(numbers);
		// Remove second element from list using index
		numbers.remove(1);
		System.out.println(numbers);

		System.out.println("********");
		// Remove second element from list using value
		for (int i = 0; i < numbers.size(); i++) {

			System.out.println(numbers.get(i));

			if (numbers.get(i) == 33) {
				System.out.println("************");
				numbers.remove(i);
				System.out.println(numbers.get(i));
			}

		}

		// Add 90 at index 3
		numbers.add(3, 90);
		System.out.println(numbers);

		// Get the length of list
		System.out.println(numbers.size());

		// Print all values from list using any values

		System.out.println(numbers.stream().findAny());

		// Convert List into array.
		Object[] array = numbers.toArray();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
