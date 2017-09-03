// a switch case --> to create calculator with + - / * functionalities only.

package task2;
import java.util.Scanner;
public class task2_8  //class
{
	public static Scanner input;

	public void showResult()// method
	{
	System.out.println("Addition -> plus");
	System.out.println("Subtraction -> minus");
	System.out.println("Multiplication -> multiply");
	System.out.println("Division -> divide");
	for(int x=0; x<4; x++)
	{
	System.out.println("Enter your calculation choice");

	input = new Scanner(System.in);
	String op= input.next();// taking String input from user
	
	System.out.println("Enter your first choice");
	double a = input.nextDouble();
	System.out.println("Enter your second choice");
	double b = input.nextDouble();
	double c=0;
	
	switch(op)
	{
	case "plus": c= a+b; System.out.println(c); break;
	case "minus": c= a-b; System.out.println(c); break;
	case "multiply": c= a*b; System.out.println(c); break;
	case "divide": c= a/b; System.out.println(c); break;
	default: System.out.println("Invalid input"); 
	}
	}
	}

public static void main(String[] args) 
	{

		task2_8 t = new task2_8();// creating object t of class task2_8
		t.showResult();// using d object to call member function
	}
}
