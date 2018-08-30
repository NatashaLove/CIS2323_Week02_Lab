import java.util.Scanner;
/**
*Java documentation
*@Natasha Love
* name of the program
* and purpose?
*specify classes and methods and how to use them - start with @ - in the beginning 

*/

//Single comment line

/* multi line comments
many lines
*/
public class HelloWorld {
	//array of as many strings as need - method
	public static void main (String [] args) {
		int myAge =0;
		char mySex = 'F';
		// float should have F in the end of the number (Long should have L)
		//float myHeight = 5.7F;
		double 	myHeight = 5.7;
		String name;
		
		//scanner here - is a class/object and inputDevice - a variable (object)
		// Here we declare a variable and initialize it - new - allocates memory for the variable
		Scanner inputDevice=new Scanner(System.in); // System is object, and shows which type of device - in or out
		
		//easy way to print in java
		System.out.println("Hello CIS2323 \n" +
		"I am " + myAge + " years old.\n" +
		"I am a " + mySex
		);
		
		System.out.println("What is your name?");
		name= inputDevice.nextLine();
		System.out.println("Hello, " + name + ", welcome to the class!");
	}
}