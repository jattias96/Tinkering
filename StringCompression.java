package tinkering;

import java.util.Scanner;

/*
 * This program compresses and prints a string. Example: aaabbcdddd -> a3b2c1d4. If the original string is shorter than its
 * 'compressed' version, the original string is printed out.
 */

public class StringCompression {

	public static void compression(String string) {
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		char prev = string.charAt(0);
		
		for (int i = 1; i < string.length(); i++) {
			if (string.charAt(i) == prev) {
				count++;
				// prev = string.charAt(i); TODO delete?
			} else {
				sb.append(prev);
				sb.append(Integer.toString(count));
				count = 1;
				prev = string.charAt(i);
			}
		}
		sb.append(prev);
		sb.append(count);
		
		
		if (string.length() <= sb.toString().length()) {
			System.out.println("String was not compressed, since original string is shorter than compressed version. "
					+ "Original string: " + string);
		} else {
			System.out.println("Original string: " + string + ". Compressed string: " + sb.toString());
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		
		String string1 = "";
		System.out.print("Please enter string you would like to compress: ");
		if (scanner1.hasNext()) {
			string1 = scanner1.next();
		}
		
		compression(string1);
		
		scanner1.close();
	}

}
