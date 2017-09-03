//to find factorial of number using iteration

package task2;
import java.util.Scanner;
public class task2_6
{
public static Scanner input;
protected static int fact(int n)
{
    int fact = 1;
    for (int i = 1; i<=n; ++i)
    {
      fact=fact*i;    
    }
    return fact;
}

public static void main(String[] args)
	{
		for(int x=0;x<4;x++)
		{
		        System.out.println("Enter the number");
		        input=new Scanner(System.in);
		        int n=input.nextInt();
		        System.out.println("The factorial of the number is "+fact(n));
		}
	}
}

