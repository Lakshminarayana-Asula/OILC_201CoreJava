import java.util.*;
public class MenuDrivenArr {
	
	static void menuDisplay() {
		System.out.println("MENU\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Exit");
	}
	
	static int[][] addition(int[][] a, int[][] b){
		int[][] sum = new int[2][2];
		
		for(int i = 0;i < a.length; i++) {
			for(int j = 0;j < b.length;j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return sum;
	}

	static int[][] subtraction(int[][] a, int[][] b){
		int[][] sub = new int[2][2];
		
		for(int i = 0;i < a.length; i++) {
			for(int j = 0;j < b.length;j++) {
				sub[i][j] = a[i][j] - b[i][j];
			}
		}
		
		return sub;
	}
	
	static int[][] multiplication(int[][] a, int[][] b){
		int[][] mul = new int[2][2];
		
		for(int i = 0;i < a.length; i++) {
			for(int j = 0;j < b.length;j++) {
				int temp = 0;
				for(int k =0;k < b.length;k++) {
					temp += a[i][k] * a[k][j];
				}
				mul[i][j] = temp;
			}
		}
		
		return mul;
	}
	
	static void displayResult(int[][] result) {
		for(int i = 0;i < 2; i++) {
			for(int j = 0;j < 2;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][2];
		int[][] b = new int[2][2];
		
		menuDisplay();
		
		System.out.println("select an option");
		int opt = sc.nextInt();
		
		System.out.println("enter elements into first array");
		for(int i = 0;i < a.length;i++) {
			for(int j = 0;j < a.length;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter elements into first array");
		for(int i = 0;i < b.length;i++) {
			for(int j = 0;j < b.length;j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		switch(opt) {
			case 1:{
				int[][] sum = addition(a, b);
				System.out.println("Addition of two arrays is:");
				displayResult(sum);
				break;
			}
			case 2:{
				int[][] sub = subtraction(a, b);
				System.out.println("Subtraction of two arrays is:");
				displayResult(sub);
				break;
			}
			case 3:{
				int[][] mul = multiplication(a, b);
				System.out.println("Multiplication of two arrays is:");
				displayResult(mul);
				break;
			}
			case 4:{
				System.exit(0);
			}
			default :{
				System.out.println("Invalid Option");
			}
		}
	}

}
