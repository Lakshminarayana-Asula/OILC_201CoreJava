
public class ConstructorOverload {

	ConstructorOverload(){
		System.out.println("Default Constructor");
	}
	
	ConstructorOverload(int a){
		this();
		System.out.println("One Param Constructor");
	}

	ConstructorOverload(int a, int b){
		this(10);
		System.out.println("Two Param Constructor");
	}
	public static void main(String[] args) {
		ConstructorOverload co = new ConstructorOverload(10,20);
		

	}

}
