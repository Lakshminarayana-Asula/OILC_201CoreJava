import java.util.Scanner;

public class FindPrimes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 values into an Array:");
		
		for(int i = 0;i < arr.length;i++) {
			arr[i] = s.nextInt();
		}
			
		System.out.println(findEven(arr));

	}

	private static String findEven(int[] arr) 
	{
		String res = "";
		
		for(int i = 0; i < arr.length;i++)
		{
			
			if(isPrime(arr[i])) 
			{
				res += arr[i] + " ";
			}
			
		}
		
		return res;
	}

	private static boolean isPrime(int n)
	{
		int count = 0;
		
		for(int i = 2;i < n;i++) {
			
			if(n%i == 0) {
				count++;
			}
			
		}
		
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
