//number pattern printing

package task2;
import java.util.Scanner;
public class task2_1_2 
{
public static void main(String[] args)
{
		Scanner sc =new Scanner(System.in);
		System.out.println("how many rows do you want in pattern? ");
		int rows = sc.nextInt();
		System.out.println(" The pattern is....!");
		for (int i=1;i<=rows;i++)
		{
			for (int j=rows;j>=i;j--)
			{
				System.out.println(j+"");
			}
			System.out.println();
		}
sc.close();
	}
}