package Assignment3;

public class Question2 {

	public static void main(String[] args) {
		/*Question-2
		 * Write a program - > Declare variables for your name and birth year, 
		 * and the program will display:
		 *" Hello, Ozzy! Based on your input, your age is 15 :) "*/

		
		displayAge("Merve",1992);
		
	}

	public static void displayAge(String name, int birthYear) {
		
		int currentYear=2021;
		int Age= currentYear-birthYear;
		System.out.println("\" Hello, "+name+"! Based on your input, your age is "+Age+" :) \"");
		
	}

	
}
