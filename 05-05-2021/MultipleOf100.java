import java.util.*;
public class MultipleOf100 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ?");
        
        System.out.println(getNextMultipleOf100(sc.nextInt()));
    }
    
    public static int getNextMultipleOf100(int num) {
         int result = 0;
         
         if(num <= 0) {
        	 result = -1;
         } 
         else {
        	 result = ((num / 100) + 1) * 100;  
         }
         
         return result;
    }
}