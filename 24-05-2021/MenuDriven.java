import java.util.*;
public class MenuDriven {
	static int result = 0;
	
	int addition(int fno, int sno) {
		result = fno + sno;
		return result;
	}
	
	int subtraction(int fno, int sno) {
		result = fno - sno;
		return result;
	}

	int multiplication(int fno, int sno) {
		result = fno * sno;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuDriven md = new MenuDriven();
		int fno, sno, res;
		
		while(true) {
			System.out.println("`````````````````````````````````````````````````");
			System.out.println("                  1. Addition                    ");
			System.out.println("                  2. Subtraction                 ");
			System.out.println("                  3. Mulitplication              ");
			System.out.println("                  4. Exit                        ");
			System.out.println("`````````````````````````````````````````````````");
			
			System.out.println("Enter The Choice ");
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter First Number");
					fno = sc.nextInt();
					System.out.println("Enter second Number");
					sno = sc.nextInt();
					res = md.addition(fno, sno);
					
					System.out.println("Addition : " + res);
					break;
					
				case 2:
					System.out.println("Enter First Number");
					fno = sc.nextInt();
					System.out.println("Enter second Number");
					sno = sc.nextInt();
					res = md.subtraction(fno, sno);
					
					System.out.println("Subtraction : " + res);
					
				case 3:
					System.out.println("Enter First Number");
					fno = sc.nextInt();
					System.out.println("Enter second Number");
					sno = sc.nextInt();
					res = md.multiplication(fno, sno);
					
					System.out.println("Muliplication : " + res);
					
				case 4:
					System.out.println("... Thanks ...");
					System.exit(0);
					
			}
		}

	}

}
