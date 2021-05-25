import java.util.*;
public class UserDaoImpl {
	Scanner sc = new Scanner(System.in);
	static User users[] = null;
	public void register() {
		System.out.println("Enter How many users want to create an Account");
		int size = sc.nextInt();
		users = new User[size];
		for(int i = 0;i < size;i++) {
			System.out.println("Enter Uid: ");
			int uid = sc.nextInt();
			System.out.println("Enter FirstName: ");
			String firstName = sc.next();
			System.out.println("Enter LastName: ");
			String secondName = sc.next();
			System.out.println("Enter Email: ");
			String email = sc.next();
			System.out.println("Enter MobileNumber: ");
			Long mobileNum = sc.nextLong();
			System.out.println("Enter Password: ");
			String password = sc.next();
			
			User u = new User();
			u.uid = uid;
			u.firstName = firstName;
			u.secondName = secondName;
			u.email = email;
			u.mobileNum = mobileNum;
			u.password = password;
			
			users[i] = u;
		}
	}
	
	boolean verifyLogin(String email, String password) {
		boolean b = false;
		if(users != null) {
			for(User u:users) {
			
				if(u.email.equals(email) && u.password.equals(password)) {
					b = true;
				}
			}
		}
		
		return b;
	}
}
