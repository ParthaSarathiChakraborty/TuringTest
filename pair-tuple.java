// Below is a Java program to create 
// a Pair tuple from Constructor 

import java.util.*; 
import org.javatuples.Pair; 

class msg 
{ 
	public static void main(String[] args) 
	{ 
		Pair<Integer, String> pair = new Pair<Integer, String>(Integer.valueOf(1), "QWERTY"); 

		System.out.println(pair); 
	} 
} 

