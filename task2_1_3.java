//star pattern printing

package task2;
import java.util.Scanner;

public class task2_1_3 
{
public static Scanner sc;
public static void main(String[] args)
  {   
	// if you give how many rows to be printed inside main , then below 4 lines not needed
	//declare i and rows
	
	sc =new Scanner(System.in);
	System.out.println("how many rows do you want in pattern? ");
	int rows = sc.nextInt();
	System.out.println(" The pattern is....!");
	
	int i,space, star=0;
	
	//printing upper triangle
	for(i=1;i<=rows;i++)
	{
		for(space=1;space<=rows-i;space++)
		{
		System.out.println(" ");
		}
	while(star!=(2*i-1))
		{
		System.out.println("*");
		star++;
		}
	star= 0;
	System.out.println("\n");
	}
	
	rows--;
	
	//printing lower triangle
	for(i=rows;i>=1;i--)
	{
		for(space=0;space<=rows-i;space++)
		{
		System.out.println(" ");
		}
	star= 0;
	while(star!=(2*i-1))
		{
		System.out.println("*");
		star++;
		}	
	System.out.println("\n");
	}
  }
}
