import java.util.*;

enum ShirtMaterial{
	 COTTON, LINEN, POLYSTER
}

class Shirt {
	double collerSize;
	double length;
	ShirtMaterial material;
	
	Shirt(){
		this.collerSize = 0;
		this.length = 0;
		this.material = ShirtMaterial.COTTON;
	}

	public Shirt(double collerSize, double length, ShirtMaterial material) {
		this.collerSize = collerSize;
		this.length = length;
		this.material = material;
	}

	public double getCollerSize() {
		return collerSize;
	}

	public void setCollerSize(double collerSize) {
		this.collerSize = collerSize;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public ShirtMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ShirtMaterial material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Shirt [collerSize=" + collerSize + ", length=" + length + ", material=" + material + "]";
	}
	
	public void display() {
		System.out.println(this.toString());
		
	}
	
	
}

public class PolimorphismTester{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Shirt collerSize and Length");
		Shirt s = new Shirt(sc.nextDouble(), sc.nextDouble(), ShirtMaterial.LINEN);
		//System.out.println(s);
		s.display();
	}
}
