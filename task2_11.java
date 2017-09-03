//to display a reverse String array. 

package task2;

import java.util.Scanner;

public class task2_11
{
	public static Scanner input;
	public static void main(String[] args) 
{
		String strA ;
		input=new Scanner(System.in);
		System.out.println("Enter string to reverse :");
		strA= input.nextLine();
		strA=new
		StringBuffer(strA).reverse().toString();
		System.out.println("Reversed String : " +strA);
		}
}
