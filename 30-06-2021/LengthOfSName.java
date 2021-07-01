import java.util.*;
public class LengthOfSName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full name(First, Middle and Last) : ");
		String name = sc.nextLine();
		
		int len = name.length() - 2;
		
		System.out.println(len);

	}

}
