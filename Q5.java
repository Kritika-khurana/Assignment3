package assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a program which will pick the values from Array and Store them List.
		String[] names = new String[5]; // array
		names[0] = "kritika";
		names[1] = "Eva";
		names[2] = "Nisha";
		names[3] = "Raj";
		names[4] = "Anaisha";

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList(names)); // storing as list
		System.out.println(ar);

	}

}
