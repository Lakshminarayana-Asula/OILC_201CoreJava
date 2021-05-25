
public class EvenNumberUpto100 {

	static String getEvenNumbers() {
		String output = "";
		
		for(int i = 1;i <= 100; i++) {
			
			if(i % 2 == 0) {
				output += i + "\n";
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
			
		System.out.println("Even Numbers 1 to 100 are: \n" + getEvenNumbers());
	}

}
