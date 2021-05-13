import java.util.*;
public class DigitChecker {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ?");
        
        System.out.println(getDiffOfDigits(sc.nextInt()));
    } 
    static int getDiffOfDigits(int num) {
    	int result = 0;
    	if(num < 0) {
    		result = -3;
    	}
    	else if(num >= 0 && num <= 9) {
    		result = -1;
    	}
    	else if(num >=10 && num <= 99) {
    		result = ((num / 10) - (num % 10));
    	}
    	else {
    		result = -2;
    	}
    	return result;
    }
}
