import java.util.*;
public class AccountDetailes {
	
	public static void main(String[] args) {
		UserDaoImpl ud = new UserDaoImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("``````````````````````````````````````");
			System.out.println("        1. CreateAccount              ");
			System.out.println("        2. SignIn                     ");
			System.out.println("        3. SignUp                     ");
			System.out.println("``````````````````````````````````````");
			
			System.out.println("Enter Choice: ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					ud.register();
					System.out.println("Account created Successfully");
					break;
					
				case 2:
					System.out.println("Enter Email id : ");
					String email = sc.next();
					System.out.println("Enter Password: ");
					String passwd = sc.next();
					
					if(ud.verifyLogin(email, passwd)) {
						System.out.println("valid");
					}
					else {
						System.out.println("Invalid");
					}
					break;
					
				case 3:
					System.out.println("Thank you");
					System.exit(0);
 			}
		}
	}

}
