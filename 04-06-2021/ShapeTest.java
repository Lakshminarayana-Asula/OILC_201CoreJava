import java.util.*;

abstract class Shape{
	abstract double getArea();
	abstract double getPerimeter();
}

class Circle extends Shape{
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this.radius = 0;
	}

	@Override
	public double getArea() {
		double area = 3.14 * (radius * radius);
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * 3.14 * radius;
		
		return perimeter;
	}
	
	public void display() {
		System.out.println("Area of Circle: " + getArea());
		System.out.println("Perimeter of Circle: " + getPerimeter());
	}

}

class Square extends Shape{
	double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		super();
		this.side = side;
	}
	
	public Square() {
		this.side = 0;
	}

	@Override
	public double getArea() {
		double area = side * side;
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 4 * side;
		
		return perimeter;
	}
	
	public void display() {
		System.out.println("Area of Square: " + getArea());
		System.out.println("Perimeter of Square: " + getPerimeter());
	}
	
}

class Rectangle extends Shape{
	double length;
	double breadth;
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle() {
		this.length = 0;
		this.breadth  = 0;
	}

	@Override
	public double getArea() {
		double area = length * breadth;
		
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2 * (length + breadth);
		
		return perimeter;
	}
	
	public void display() {
		System.out.println("Area of Rectangle: " + getArea());
		System.out.println("Perimeter of Rectangle: " + getPerimeter());
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius for circle to calculate area and perimeter: ");
		Circle c = new Circle(sc.nextDouble());
		c.display();
		System.out.println();
		
		System.out.println("Enter side value for Square to claculate area and perimeter: ");
		Square s = new Square(sc.nextDouble());
		s.display();
		System.out.println();
		
		System.out.println("Enter length and breadth for Rectangle to calculate area and perimeter: ");
		Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
		r.display();
	
	}

}
