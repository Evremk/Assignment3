package Assignment3;

public class Question3 {

	public static void main(String[] args) {
		
/*Question-3
Write a Java program that displays the area of a rectangle with a width of 4.5 
and a height of 7.9 using the following formula:
area = width * height 
*/

		calcRectangleArea(4.5, 7.9);
		
	}

	public static void calcRectangleArea(double width, double height) {
		
		double rectangleArea = width*height;
		System.out.println("The area of the rectangle is "+rectangleArea);
	}

}
