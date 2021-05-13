import java.util.*;
public class StackOperations {
	static int max = 5, top = -1;
	static Object[] stack = new Object[max];
	
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
		}
	}
	
	static void pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			stack[top] = null;
			top--;
			
		}
		
	}
	
	static Object peek() {
		
		if(isEmpty()) {
			return "Stack is Empty";
		}
		else {
			return stack[top];
		}
		
	}
	
	static void display() {
		for(int i = 0;i <= top;i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu\n1. Push\n2. Pop\n3. Peek\n4. Display\n5. exit");
		
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
