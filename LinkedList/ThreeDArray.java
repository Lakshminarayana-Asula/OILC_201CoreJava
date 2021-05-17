import java.util.*;
public class ThreeDArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] college = new int[2][2][4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < college.length;i++) {
			System.out.println("Enter " + (i + 1) + " Branch detailes");
			for(int j = 0;j < college[i].length;j++) {
				System.out.println("enter " + (j+1) + " student detailes ");
				for(int k = 0;k < college[i][j].length;k++) {
					college[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Student detailes are:");
		for(int i = 0;i < college.length;i++) {
			System.out.println((i + 1) + " branch detailes");
			for(int j = 0;j < college[i].length;j++) {
				System.out.println((j + 1) + " student detailes");
				for(int k = 0;k < college[i][j].length;k++) {
					System.out.print(college[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("------------------------");
		}
	}
}
