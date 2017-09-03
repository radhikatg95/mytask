//to check if a number is Armstrong number or not? (input 153 output true, 123 output false)

package task2;

import java.util.Scanner;
public class task2_5 
{
public static Scanner input;
public static void main(String[] args) 
  {
		int n,sum=0,a,r;
		input=new Scanner(System.in);
		System.out.println("Enter the number to check if it is Armstrong or not");
		n=input.nextInt();
		
		a=n;

		while(a!=0)
		{ 
			r=a%10;
			sum=sum + r*r*r ;
			a= a/10;
		}
		
		if(n==sum)
			System.out.println( "The entered number " + n + " is Armstrong --- TRUE ");
		else
			System.out.println( "The entered number " + n + " is not Armstrong --- FALSE");
		
   }
}
