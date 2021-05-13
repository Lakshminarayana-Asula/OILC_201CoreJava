import java.util.Scanner;

public class SignFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
        
        System.out.println(findSign(sc.nextInt()));
    }

    public static int findSign(int num) {
    	int result = 0;
    	
    	if(num < 0) {
    		result = -1;
    	}
    	else if(num > 0) {
    		result = 1;
    	}
    	else {
    		result = 0;
    	}
  	
    	return result;
    }
}
