//to display the fibonacci series till less than 200 using only 2 variables.

package task2;
import java.util.Scanner;
public class task2_3
{
	public static Scanner input;
	public static void main(String[] args) 
{
		int n, a= 0, b= 1;
		input=new Scanner(System.in);
		System.out.println("Enter number upto or less than which fibonacci series to be displayed :");
		n=input.nextInt();
		System.out.println("The fibonacci numbers less than or till "+ n +" are:");
		        while (a <= n)
		        {
		        	System.out.print(a + " ");  // print - print in same line
		        								// println - prints each in next next line
		        	int sum = a+b;
		            a=b;
		            b = sum;
		        }
}
}
