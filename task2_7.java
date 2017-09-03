package task2;
import java.util.Scanner;
public class task2_7 
{
public static Scanner input;
public static void main(String[] args) 
	{
		input=new Scanner(System.in);
		for(int x=0;x<=2;x++)
		{
		System.out.println("Enter a character : ");
		char ch=input.next( ).charAt(0);	 		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
		System.out.println("Entered character "+ch+" is  Vowel"); 
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
		System.out.println("Entered character "+ch+" is Consonant");
		}
		else
		 {
		System.out.println("Not an alphabet");
		 }
		}
	}
}