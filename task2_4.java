//to check if a name is palindrome

package task2;
import java.util.Scanner;
public class task2_4
{
public static Scanner in;
public static void main(String[] args)
{
 
 in = new Scanner(System.in);
 System.out.println("Enter a string");
 String a=in.nextLine();
 
 StringBuffer original=new StringBuffer(a);
 StringBuffer reverse=new StringBuffer(original);
 
 original.reverse();
 
  System.out.println("Orginal String = "+original);
  System.out.println("Reverse String = "+reverse);
 
 if(String.valueOf(original).compareTo(String.valueOf(reverse))==0)
   System.out.println(" Result : Palindrome ");
 else
    System.out.println(" Result : Not Palindrome ");
}
}


