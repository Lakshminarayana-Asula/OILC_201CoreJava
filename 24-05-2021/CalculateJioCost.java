
public class CalculateJioCost {

	static int getTotalAmount() {
		int quat_Cost = 699;
		int gst = (699 * 18) / 100;
		
		return quat_Cost + gst;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Quaterly jio fiber Cost is: " + getTotalAmount());

	}

}
