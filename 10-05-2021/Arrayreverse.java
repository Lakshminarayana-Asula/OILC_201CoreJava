import java.util.Scanner;

public class Arrayreverse {
	
	static void reverse(int[] arr) {
		System.out.println("the reverse order of array elements is");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}	
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		reverse(arr);
	}
}
