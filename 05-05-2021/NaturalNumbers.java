import java.util.*;
public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: \nNote: first value should be smaller than second value");
		
		System.out.println(getNaturalNumbers(sc.nextInt(), sc.nextInt()));
	}
	
	static String getNaturalNumbers(int firstNum, int secNum) {
		String output = "";
		
		if(firstNum < 0 || secNum <0) {
			output += -1;
		}
		else if(firstNum == 0 || secNum == 0) {
			output += -2;
		}
		else {
			while(firstNum <= secNum) {
				output += firstNum + " ";
				
				firstNum++;
			}
		}
		
		return output;
	}
}
