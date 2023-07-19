import java.util.*;
public class Programming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a java program that reads a Fahrenheit degree in a double value from the console, then 
		//converts it to Celsius and displays the result. The formula for the conversion is as follows:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in Fahrenheit");
		double fahrenheit = sc.nextDouble();
		double celcius = (fahrenheit - 32.0) * (5.0 / 9);
		System.out.println("Your given fahrenheit is " + celcius + " degree celcius");
		

	}

}
