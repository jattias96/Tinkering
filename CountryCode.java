/*
 * As an example activity using HashMaps, create a program that will take in a three-letter country code and will return
 * the full name of the country to which it belongs. For example:

Input | Output
----- | ----------------------------------------------------
 GBR  | United Kingdom of Great Britain and Northern Ireland
 IDN  | Indonesia
 IND  | India

As an extension, if the input is greater than 3 letters,
consider it as the name of a country, and return the three-letter code for it.

Write a helpful error message if the input is neither a valid code nor a country name.
 */

package tinkering;

import java.util.HashMap;
import java.util.Scanner;

public class CountryCode {
	
	public HashMap<String, String> list;
	
	public CountryCode() {
		list = new HashMap<String, String>();
	}

	public String input(String x) {
		return this.list.get(x);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		CountryCode demo = new CountryCode();
		
		demo.list.put("123", "United States");
		demo.list.put("124", "Mexico");
		
		System.out.print("Enter country code:");
		String x = in.next();
		if(x.length() == 3) {
			System.out.println(demo.input(x));
		}
		else {
			System.out.println("Please rerun the program and enter a valid country code.");
		}
		
		
	}

}
