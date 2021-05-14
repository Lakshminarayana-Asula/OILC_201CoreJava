import java.util.*;
public class StackOperations {
	static int max = 5, top = -1;
	static Object[] stack = new Object[max];
	
	static void menu() {
		String menu = "Stack Operations \n";
		menu += "1. Push \n";
		menu += "2. Pop \n";
		menu += "3. Peek \n";
		menu += "4. Display \n";
		menu += "5. Exit \n";
		
		System.out.println(menu);
	}
	
	static boolean isEmpty() {
		
		if(top == -1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static boolean isFull() {
		 
		if(top == max-1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	static void push(Object obj) {
		
		if(isFull()) {
			System.out.println("Stack is full");
		}
		else {
			top++;
			stack[top] = obj;
			System.out.println(obj + " is added into the stack");
		}
	}
	
	static void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(stack[top] + " is removed from the stack");
			top--;	
		}
		
	}
	
	static Object peek() {
		
		if(isEmpty()) {
			return "Stack is Empty";
		}
		else {
			System.out.println("Top Element is :");
			return stack[top];
		}
		
	}
	
	static void display() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}
		else {
			System.out.println("Stack Elements are: ");
			
			for(int i = top;i >= 0;i--) {
				System.out.print(stack[i] + " ");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		
		do {
			System.out.println("Enter any Option ");
			int opt = sc.nextInt();
			
			switch(opt) {
				case 1:{
					System.out.println("Enter element");
					push(sc.next());
					break;
				}
				case 2:{
					pop();
					break;
				}
				case 3:{
					System.out.println(peek());
					break;
				}
				case 4:{
					display();
					break;
				}
				case 5:{
					System.exit(0);
				}
				default:{
					System.out.println("Invalid Option");
				}
			}
			
		}while(true);
	}
}
