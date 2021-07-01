import java.util.*;
public class ValidateName {

	public String validate(String name) {
		String res = "Not Validate";
		
		if(name.startsWith("a")) {
			res = "Validate";
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ValidateName v = new ValidateName();
		System.out.println("Enter Name");
		String name = sc.next();
		
		System.out.println(v.validate(name));
	}

}
