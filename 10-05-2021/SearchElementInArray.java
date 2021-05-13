import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int [10];
		
		System.out.println("enter 10 values into an Array:");
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter a key value to Search:");
		int key = s.nextInt();
		
		System.out.println(findElement(arr,key));
	}

	private static String findElement(int[] arr, int key)
	{
		String res = "";
		
		for(int i = 0;i < arr.length;i++) 
		{
			if(arr[i] == key) 
			{
				res += key+" is found at position: " + (i+1) + " \n";
			}
		}
		
		return res;
	}

}
