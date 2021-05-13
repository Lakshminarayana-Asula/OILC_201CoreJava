import java.util.*;
public class RangeWithStep {
	
	static String getNumbersInRange(int startNum, int endNum, int step) {
		String out = "";
		
		if(startNum < 0 || endNum < 0) {
			out += -1;
		}
		else if(startNum == endNum) {
			out += -2;
		}
		else if(startNum > endNum) {
			out += -3;
		}
		else {
			for(int i = startNum+1; i < endNum; i += step) {
				out += i + " ";
			}
		}
		
		return out;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter range and step number");
		System.out.println(getNumbersInRange(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

}
