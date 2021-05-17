import java.util.*;
class Node{
	int data;
	Node link;
	Node(){
		this.link = null;
	}
}

public class LinkedListDemo {
	static Node head = null;
	
	public static void create(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		
		if(head == null) {
			head = temp;
		}
		else {
			Node p = head;
			
			while(p.link != null) {
				p = p.link;
			}
			
			p.link = temp;
		}
		
	}
	
	public static void print() {
		Node temp = head;
		
		if(temp == null) {
			System.out.println("No Elements are present in the LinkedList");
		}
		else {
			while(temp.link != null) {
				System.out.println(temp.data);
				temp = temp.link;
			}
			System.out.println(temp.data);
		}	
	}
	
	public static int length() {
		int count = 0;
		Node temp = head;
		
		if(temp == null) {
			System.out.println("No elements are present in the linked list");
		}
		else {
			while(temp.link != null) {
				count++;
				temp = temp.link;
			}
			count++;
		}
		
		return count;
	}
	
	public static void addAtBegin(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		
		if(head == null) {
			head = temp;
		}
		else {
			temp.link = head;
			head = temp;
		}
	}
	
	static void menu() {
		String m = "Menu Driven Application\n";
		m += "!. Add Element\n";
		m += "2. Display Elements\n";
		m += "3. Number Of Elements\n";
		m += "4. Add at Begin\n";
		m += "5. Delete\n";
		m += "6. Add at Specific Position\n";
		m += "7. exit\n";
		m += "Select any position";
		
		System.out.println(m);
	}
	
	public static void delete(int loc) {
		Node temp = head;
		
		if(loc > length()) {
			System.out.println("Invalid option");
		}
		else if(loc == 1){
			temp = head;
			head = temp.link;
			temp.link = null;
			System.out.println("deleted wlwmwnt is: " + temp.data);
		}
		else {
			Node p,q;
			p = head;
			int i = 1;
			while(i < loc--) {
				p = p.link;
				i++;
			}
			
			q = p.link;
			p.link = q.link;
			q.link = null;
			System.out.println("deleted Element is = " + q.data);
		}
	}
	
	static public void accept() {
		System.out.println("enter any value");
	}
	
	public static void addAfter(int loc, int data) {
		Node p;
		Node temp = new Node();
		temp.data = data;
		temp.link = null;
		if(loc > length()) {
			System.out.println("Invalid Location");
		}
		else {
			int i = 1;
			p = head;
			while(i < loc--) {
				p = p.link;
				i++;
			}
			temp.link = p.link;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListDemo obj = new LinkedListDemo();
		
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) {
				case 1:
					accept();
					create(sc.nextInt());
					break;
				case 2:
					print();
					break;
				case 3:
					System.out.println(length());
					break;
				case 4:
					accept();
					addAtBegin(sc.nextInt());
					break;
				case 5:
					System.out.println("Enter any value");
					delete(sc.nextInt());
					break;
				case 6:
					System.out.println("Enter loc, data");
					addAfter(sc.nextInt(), sc.nextInt());
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice");
			}
		}
	}

}
