import java.util.*;
public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] stud= new int[3][];
		stud[0] = new int[3];
		stud[1] = new int[2];
		stud[2] = new int[1];
		
		for(int i = 0;i < stud.length;i++) {
			System.out.println("Enter " + (i + 1) + " detailes");
			for(int j = 0;j < stud[i].length;j++) {
				stud[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < stud.length;i++) {
			System.out.println("student " + (i + 1) + " detailes");
			for(int j = 0;j < stud[i].length;j++) {
				System.out.print(stud[i][j] + " ");
			}
			System.out.println();
		}
	}
}
