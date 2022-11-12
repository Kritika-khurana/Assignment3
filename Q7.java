package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write a program which will display true if list contains Mobile else prints
		// false
		// List - Web Automation, API Automation, Mobile Automation.
		// Output – True

		List<String> ar = new ArrayList<String>(Arrays.asList("Web Automation", "API Automation", "Mobile Automation"));
		System.out.println(ar.toString());
		System.out.println(ar.toString().contains("Mobile"));

	}

}
