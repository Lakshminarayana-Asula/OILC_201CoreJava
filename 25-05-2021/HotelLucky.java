import java.util.*;
public class HotelLucky {
	static Scanner sc = new Scanner(System.in);
	static int cost = 0;
	static String items="";
	
	void menu() {
		String s = "`````````````Hotel Menu`````````````````\n";
		s += "      Item       --     Cost     \n";
		s += "      1. Idly    --      15      \n";
		s += "      2. Dosa    --      20      \n";
		s += "      3. Bonda   --      20      \n";
		s += "      4. Puri    --      25    \n";
		s += "      5. Bill              ";
		
		System.out.println(s);
	}
	
	void idly() {
		System.out.println("How many Plates do you want: ");
		int plates = sc.nextInt();
		if(plates > 0) {
			cost += plates * 15;
			items += "idly -- " + plates + " Plates\n";
		}
	}
	
	void dosa() {
		System.out.println("How many Plates do you want: ");
		int plates = sc.nextInt();
		if(plates > 0) {
			cost += plates * 20;
			items += "Dosa -- " + plates + " Plates\n";
		}
	}
	
	void bonda() {
		System.out.println("How many Plates do you want: ");
		int plates = sc.nextInt();
		if(plates > 0) {
			cost += plates * 20;
			items += "Bonda -- " + plates + " Plates\n";
		}
	}
	
	void puri() {
		System.out.println("How many Plates do you want: ");
		int plates = sc.nextInt();
		if(plates > 0) {
			cost += plates * 25;
			items += "puri -- " + plates + " Plates\n";
		}
	}
	
	String bill() {
		String bill ="Ordered Items List is:\n";
		
		if(items.length() == 0) {
			bill += " Sorry No items are Ordered";
		}
		else {
			bill += items + "\n" + "Bill : " + cost;
		}
		
		return bill;
	}
	
	void exit() {
		System.out.println("\n----Thank You For Visiting Lucky Hotel-----");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HotelLucky hl = new HotelLucky();
		
		while(true) {
			hl.menu();
			System.out.println("Choose an Item");
			int item = sc.nextInt();
			
			switch(item) {
				case 1:
					hl.idly();
					break;
				case 2:
					hl.dosa();
					break;
				case 3:
					hl.bonda();
					break;
				case 4:
					hl.puri();
					break;
				case 5:
					System.out.println(hl.bill());
					hl.exit();
			}
		}
	}

}
