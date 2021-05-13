import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        
        System.out.println("Given Number is " + isEvenOrOdd(sc.nextInt()));
    }

    public static String isEvenOrOdd(int num) {
    	String result;
    	
    	if(num <= 0) {
    		result = "Invalid Input";
    	}
    	else if(num % 2 == 0) {
    		result = "Even";
    	}
    	else {
    		result = "Odd";
    	}
  	
    	return result;
    }
}
