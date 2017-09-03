//to compare the length of two arrays and display the longer array.

package task2;

public class task2_10 {
		
	public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3,4,5};
        int arr2[] = {1, 2, 3};
        if (arr1.length > arr2.length) // Same as arr1>(arr2)
            System.out.print("first array");
        else
            System.out.println("second array");
    }
}