import java.util.*;
class Rectangle{
	double length;
	double breadth;
	
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	double getArea() {
		return length * breadth;
	}
	
	double getPerimeter() {
		return 2 * length * breadth;
	}
	
	String display() {
		String result = "";
		result += "Area: " + getArea() + "\n";
		result += "Perimeter: " + getPerimeter() + "\n";
		
		return result;
	}
	
}

public class Myclass{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth ");
		
		Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
		System.out.println(r.display());
	}
	
}
