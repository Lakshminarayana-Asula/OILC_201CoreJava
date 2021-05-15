import java.util.*;
public class QueueOperations {
	static int front = 0, rear = 0, size = 5;
	static int[] queue = new int[size];
	
	static void menu() {
		String menu = "Queue Operations \n";
		menu += "1. Insert \n";
		menu += "2. Remove \n";
		menu += "3. Display \n";
		menu += "4. Exit \n";
		menu += "Enter any option";
		
		System.out.println(menu);
	}
	
	static boolean isEmpty() {
		boolean b = false;
		
		if(front == rear) {
			b = true;
		}
		
		return b;
	}
	
	static boolean isFull() {
		boolean b = false;
		
		if(rear == queue.length) {
			b = true;
		}
		
		return b;
	}
	
	static void insert(int element) {
		
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		else {
			queue[rear++] = element;
			System.out.println(element + " is added into the queue.");
		}
		
	}
	
	static void remove() {
		
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println(queue[front] + " is removed from the queue.");
			for(int i = front;i < queue.length-1;i++) {
				queue[i] = queue[i+1];
			}
			
			rear--;
			
		}
	}
	
	static void display() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Queue elements are");
			
			for(int i = front; i < rear;i++) {
				System.out.print(queue[i] + " ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do{
			menu();
			int opt = sc.nextInt();
			
			switch(opt) {
				case 1:{
					System.out.println("Enter element");
					insert(sc.nextInt());
					break;
				}
				case 2:{
					remove();
					break;
				}
				case 3:{
					display();
					break;
				}
				case 4:{
					System.exit(0);
				}
				default:{
					System.out.println("Invalid Option");
				}
			}
		}while(true);
	}

}
