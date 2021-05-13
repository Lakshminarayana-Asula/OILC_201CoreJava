import java.util.Scanner;

public class EvenNumbers {

	static String findEven(int[] arr) {
		String out = "";
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] % 2 ==0) {
				out += arr[i]+ " ";
			}
		
		}
		return out;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("enter 10 values into an array");
		for(int i =0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Even Numbers are: " + findEven(arr));
	}
}
