package Assignment3;

public class Question7 {

	public static void main(String[] args) {
/*Question-7

Write a program that determines the change to be dispensed 
from a vending machine. An item in the machine can cost between 
25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), 
and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles*/
		//quarters=25ct, dimes=10ct, nickles=5ct;
		
		calcChange(45);

	}
	public static void calcChange(int price) {
	
		if(price<25||price>100) {
			System.out.println("Not valid price");
		}else {
		
	int change=100-price;
	
	int quarterAmount= change/25;
	
	int dimesAmount=(change%25)/10;
	
	int nicklesAmount=((change%25)%10)/5;

	
	System.out.println("Your change is "+quarterAmount+" quarters, "+dimesAmount+
			" dimes, and "+nicklesAmount+" nickles");
		}
	}
	}

	

