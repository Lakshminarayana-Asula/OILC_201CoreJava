import java.util.*;
public class FindTriangle {
	
	static String findTriangle(int val1, int val2, int val3) {
		String result = "";
		
		if(val1 == 0 || val2 == 0 || val3 == 0) {
			result += -1;
		}
		else if(val1 < 0 || val2 < 0 || val3 < 0) {
			result += -2;
		}
		else if((val1 + val2) < val3 && (val1 + val3) < val2 && (val2 + val3) < val1) {
			result += -2;
		}
		else if(val1 == val2 && val2 == val3){
			result += "SCALANE Triangle";
		}
		else if(val1 == val2 || val2 == val3 || val1 == val3){
			result += "EQUILATERAL Triangle";
		}
		else if(val1 != val2 && val2 != val3 && val1 != val3){
			result += "ISOSCELES Triangle";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three slides values");
		
		System.out.println(findTriangle(sc.nextInt(), sc.nextInt(), sc.nextInt()));
	}

}
