//to copy one array into another(USING ArrayCopy)

package task2;

public class task2_9 {

	public static void main(String[] args) {
		int A1[]={10,20,30,40,50,60,70,80,90,100};
		int A2[]={5,15,25,35,45,55,65,75,85,95,105};
		System.out.println("\n The first array is :");
		for(int i=0;i<10;i++)
		System.out.print(A1[i]+" ");
		System.out.println("\n The Second array is :");
		for(int i=0;i<10;i++)
		System.out.print(A2[i]+" ");
		System.arraycopy(A1,3,A2,3,2);
		System.out.println("\n The Array after copying is :");
		for(int i=0;i<10;i++)
		System.out.print(A2[i]+" ");
	}

}
