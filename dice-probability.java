// Java program to find probability to C win the match 

import java.io.*; 

class dc 
{// Recursive function to return gcd of a and b 
	static int __gcd(int a, int b) 
	{ 
		// Everything divides 0 
		if (a == 0) 
		return b; 
		if (b == 0) 
		return a; 
		
		// base case 
		if (a == b) 
			return a; 
		
		// a is greater 
		if (a > b) 
			return __gcd(a-b, b); 
		return __gcd(a, b-a); 
	} 
	
	
// function to find probability to C win the match 
static void Probability(int A, int B) 
{ 
	int C = 6 - Math.max(A, B); 

	int gcd = __gcd(C, 6); 

	System.out.print( C / gcd + "/" + 6 / gcd); 
} 

// Driver code 

	public static void main (String[] args) 
	
	{ 
	int A = 2, B = 4; 

	Probability(A, B); 
	} 
} 


