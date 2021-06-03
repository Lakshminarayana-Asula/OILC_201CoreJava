import java.util.*;
enum Operation{
	ADD,SUB,MUL,DIV;
}

public class EnumDemo {
	int firstNum;
	int secondNum;
	Operation op;
	
	EnumDemo(int firstNum, int secondNum, Operation op){
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.op = op;
	}
	
	String getOperation() {
		String res = "";
		
		switch(op) {
			case ADD:
				res = "Sum: " + (firstNum + secondNum);
				break;
			case SUB:
				res = "Sum: " + (firstNum + secondNum);
				break;
			case MUL:
				res = "Sum: " + (firstNum + secondNum);
				break;
			case DIV:
				res = "Sum: " + (firstNum + secondNum);
				break;
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers");
		Operation op = Operation.ADD;
		EnumDemo ed = new EnumDemo(sc.nextInt(), sc.nextInt(), op);
		System.out.println(ed.getOperation());
		
	}

}
