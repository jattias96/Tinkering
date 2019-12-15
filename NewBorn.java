package tinkering;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class NewBorn {

	// Fields:
		private String firstName;
		private String lastName;
		private String dateOfBirth;
	
	// Constructor:
		public NewBorn(String firstName, String lastName, String dateOfBirth) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth = dateOfBirth;
		}
		
	
	// Methods:
		public String getFirstName() {
			return this.firstName;
		}
		
		public String getLastName() {
			return this.lastName;
		}
		
		public String getDOB() {
			return this.dateOfBirth;
		}
		
	// Main method:
		public static void main(String[] args) throws FileNotFoundException {
			
			// Preliminary activities (creating scanners, importing files and scanning them into arrays).
				File boyFile = new File("C:\\CodeRepository\\Tinkering\\src\\tinkering\\BoyNames.txt");
				Scanner boyScanner = new Scanner(boyFile);
				
				File girlFile = new File("C:\\CodeRepository\\Tinkering\\src\\tinkering\\GirlNames.txt");
				Scanner girlScanner = new Scanner(girlFile);
				
				String[] boyNames = new String[200];
				for (int i = 0; i < 200; i++) {
					if (boyScanner.hasNext()) {
						boyNames[i] = boyScanner.next();
					}
				}
				
				String[] girlsNames = new String[200];
				for (int i = 0; i < 200; i++) {
					if (girlScanner.hasNext()) {
						girlsNames[i] = girlScanner.next();
					}
				}
			
			
				
			// Querying user for initial choice:
				Scanner in = new Scanner(System.in);
				
				System.out.println("Please select one of the following options by typing in their corresponding number and pressing Enter:");
				System.out.println("(1) Enter a name to check if it is among the most popular names.");
				System.out.println("(2) Receive a suggestion.");
				System.out.println("(3) See all names starting with a specific letter.");
				System.out.print("");
				
				String choice = "";
				String choice2 = "";
				String choice3 = "";
				
				if (in.hasNext()) {
					choice = in.next();
				}
			
				
				
			// Control flow based on initial choice:
				
				// Choice 1:
				
					Random random = new Random();
					if (choice.equals("1")) {
						boolean done = false;
						while (!done) {
							String firstName = "";
							System.out.print("Please enter name, capitalizing first and only first initial: ");
							if (in.hasNext()) {
								firstName = in.next();
							}
							for (int i = 0; i < 200; i++) {
								if (firstName.equals(boyNames[i])) {
									System.out.println("You picked a beautiful boy's name.");
								}
								if (firstName.equals(girlsNames[i])) {
									System.out.println("You picked a beautiful girl's name.");
								}
							}
							boolean accepted = false;
							System.out.print("Do you accept this name? Please type 1 for 'yes' and 2 for 'no' and press Enter to continue");
							String response = "";
							if (in.hasNext()) {
								response = in.next();
							}
							
							if (response.equals("1")) { // Yes
								accepted = true;
							}
							else if (response.equals("2")) { // No
								accepted = false;
							}
							
							if (accepted) {
								done = true;
								String lastName = "";
								String dateOfBirth = "";
								System.out.print("Please enter the newborn's last name and press Enter: ");
								if (in.hasNext()) {
									lastName = in.next();
								}
								System.out.print("Please enter the newborn's expected date of birth and press Enter: ");
								if (in.hasNext()) {
									dateOfBirth = in.next();
								}
								
								NewBorn newborn1 = new NewBorn(firstName, lastName, dateOfBirth);
								System.out.println("First name: " + newborn1.getFirstName());
								System.out.println("Last name: " + newborn1.getLastName());
								System.out.println("Date of Birth: " + newborn1.getDOB());
							}
							else if (!accepted) {
								System.out.print("Do you want to try it again or exit the program? Enter 1 to try again and 2 to exit.");
								if (in.hasNext()) {
									String exit = in.next();
									if (exit.equals("1")) {
										continue;
									}
									else if (exit.equals("2")) {
										break;
									}
								}
							}
						}
					}
				
				// Choice 2:
					else if (choice.equals("2")) {
						boolean done = false;
						while (!done) {
							String firstName = "";
							System.out.println("Do you want a boy or a girl name? Type in the corresponding number and press Enter:");
							System.out.println("(1) Boy.");
							System.out.println("(2) Girl.");
							System.out.print("");
							if (in.hasNext()) {
								choice2 = in.next();
							}
							
							if (choice2.equals("1")) {
								firstName = boyNames[random.nextInt(200)];
								System.out.println(firstName);
							}
							else if (choice2.equals("2")) {
								firstName = girlsNames[random.nextInt(200)];
								System.out.println(firstName);
							}
							
							boolean accepted = false;
							System.out.print("Do you accept this name? Please type 1 for 'yes' and 2 for 'no' and press Enter to continue");
							String response = "";
							if (in.hasNext()) {
								response = in.next();
							}
							
							if (response.equals("1")) { // Yes
								accepted = true;
							}
							else if (response.equals("2")) { // No
								accepted = false;
							}
							
							if (accepted) {
								done = true;
								String lastName = "";
								String dateOfBirth = "";
								System.out.print("Please enter the newborn's last name and press Enter: ");
								if (in.hasNext()) {
									lastName = in.next();
								}
								System.out.print("Please enter the newborn's expected date of birth and press Enter: ");
								if (in.hasNext()) {
									dateOfBirth = in.next();
								}
								
								NewBorn newborn1 = new NewBorn(firstName, lastName, dateOfBirth);
								System.out.println("First name: " + newborn1.getFirstName());
								System.out.println("Last name: " + newborn1.getLastName());
								System.out.println("Date of Birth: " + newborn1.getDOB());
							}
							else if (!accepted) {
								System.out.print("Do you want to try it again or exit the program? Enter 1 to try again and 2 to exit.");
								if (in.hasNext()) {
									String exit = in.next();
									if (exit.equals("1")) {
										continue;
									}
									else if (exit.equals("2")) {
										break;
									}
								}
							}
						}
					}
				
				// Choice 3:
					else if (choice.equals("3")) {
					System.out.println("Do you want a boy or a girl name? Type in the corresponding number and press Enter:");
					System.out.println("(1) Boy.");
					System.out.println("(2) Girl.");
					System.out.print("");
					if (in.hasNext()) {
						choice3 = in.next();
					}
					
					System.out.print("Enter the letter that you want your names to begin with and press Enter (make sure to capitalize it): ");
					String letter = "";
					if (in.hasNext()) {
						letter = in.next();
					}
					
					if (choice3.equals("1")) { // Boy
						for (int i = 0; i < 200; i++) {
							if (boyNames[i].substring(0, 1).equals(letter)) {
								System.out.println(boyNames[i]);
							}
						}
					}
					else if (choice2.equals("2")) { // Girl
						for (int i = 0; i < 200; i++) {
							if (girlsNames[i].substring(0, 1).equals(letter)) {
								System.out.println(girlsNames[i]);
							}
						}
					}
				}
			
			
				
			// Closing up shop:	
				boyScanner.close();
				girlScanner.close();
				in.close();
		}

}
