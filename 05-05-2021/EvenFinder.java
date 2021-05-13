import java.util.*;
public class EvenFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
        
        System.out.println(isEven(sc.nextInt()));
    }
    
    public static int isEven(int num) {
    	int result = 0;
    	
    	if(num <= 0){
    		result = -1;
    	}
    	else if(num % 2 != 0){
    		result = 0;
    	}
    	else {
    		result = 1;
    	}
    	
    	return result;
    }
}
