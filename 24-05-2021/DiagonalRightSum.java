import java.util.*;

public class DiagonalRightSum {
	static Scanner sc = new Scanner(System.in);

	static int getDiagonalRightSum(int[][] arr) {
		int sum = 0;
		System.out.println("Enter values into array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elements are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				;
			}
			System.out.println();
		}
		int colSize = arr[0].length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == colSize) {
					sum += arr[i][j];
					colSize--;
				}
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter array size");
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		int[][] arr = new int[rows][columns];

		System.out.println("values sum : \n" + getDiagonalRightSum(arr));
	}

}
