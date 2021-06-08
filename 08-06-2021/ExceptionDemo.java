
public class ExceptionDemo {

	public static int m1() {
		try {
			System.out.println(10 / 0);
			return 10;
			
		}
		catch(Exception e) {
			return 20;
		}
		finally{
			return 30;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(m1());
		
	}

}
