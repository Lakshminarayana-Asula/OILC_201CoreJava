
public class StringExample {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println("Before " + str + " " + str.hashCode());
		str += "welcome";
		System.out.println("After " + str + " " + str.hashCode());
		
		StringBuffer sb =new StringBuffer("hello");
		System.out.println("Before " + sb + " " + sb.hashCode());
		sb.append("welcoome");
		System.out.println("Before " + sb + " " + sb.hashCode());
	}

}
