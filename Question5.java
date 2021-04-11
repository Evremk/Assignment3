package Assignment3;

public class Question5 {

	public static void main(String[] args) {
/*Question-5
Write a program that outputs the number of hours, 
minutes, and seconds that corresponds to input total seconds.
		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds

		-Using %(remainder) and / operators, find out how many whole hours, 
		 minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result

		       Sample Output:

		       inputSecond is 3695

		      1 hours, 1 minutes, and 35 seconds*/
		convertSeconds(7262);

	}

	public static void convertSeconds(int InputSeconds) {
		
		int Minutes;
		int hours;
		int seconds;
		
		Minutes=InputSeconds/60;
		hours=Minutes/60;
		
		int leftMinutes=Minutes%60;
		
		seconds=InputSeconds%60;
		System.out.println("InputSecond is "+InputSeconds);
		System.out.println(hours+" hours, "+leftMinutes+" minutes, and "+seconds+" seconds");
		
	}

}
