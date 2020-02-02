// JAVA implementation to check if the 
// product of digit sum and its 
// reverse equals the number or not 
import java.util.*;
class Rev_Digit
 { 
	
	// Function that returns number after 
	// performing operations. 
	static int check(int num) 
	{ 
		int digitSum = 0; 
		
		// loop used to count digit sum 
		// of numbers. 
		while(num > 0) 
		{ 
			digitSum = digitSum + num % 10; 
			num = num / 10; 
		} 
		int temp = digitSum; 
		int reverseDigitSum = 0; 
		
		// loop that reverse digit sum. 
		while(temp > 0) 
		{ 
			int rem = temp % 10; 
			reverseDigitSum = reverseDigitSum * 10
							+ rem; 
			temp = temp / 10; 
		} 
		
		// product of digit sum and reverse digit 
		// sum and assign it to number variables. 
		int number = digitSum * reverseDigitSum; 
		return number; 
	} 
	
	// Driver function 
	public static void main(String args[]) 
	{ 
		int num = 1729; 
	
		// call check() function. 
		int x = check(num); 
	
		// check if original number equals 
		// to x or not 
		if (num == x) 
			System.out.println("Yes"); 
		else
		System.out.println("No"); 
	} 
} 



