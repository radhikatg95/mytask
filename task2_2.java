//to check whether entered number is prime or not

package task2;
import java.util.Scanner;
public class task2_2 
{
private static Scanner a;
public static void main(String[] args) 
  {
 int i,num=0,flag=0;    
  a = new Scanner(System.in); // local variable error occurred so have declared Scanner as static and private before main
 System.out.println("enter the number: ");
 num = a.nextInt();		     
for(i=2;i<num;i++)
   {
	if(num%i==0)
	  {
	    System.out.println("Number " + num + " is not prime");      
	    flag=1;    
        break;    
	   }    
    }    
if(flag==0)    
   {
	  System.out.println("Number " + num +" is prime");    
   }
  }
}