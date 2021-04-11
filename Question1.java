package Assignment3;

public class Question1 {

	public static void main(String[] args) {
/*Question-1
Write a program to convert gallons into Liters and display it.
Sample output: 15 gallon is 56.7812 liter*/

		convertInLiters(10);
		
	}

	public static double convertInLiters(int gallons) {
		
		 double litres= gallons*3.785;
		 System.out.println(gallons+" gallon is "+litres+" liter");
		 return litres;
	}

}
