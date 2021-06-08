import java.util.*;
class LeaveQuotaExceededException extends Exception{
	LeaveQuotaExceededException(String exc){
		super(exc);
	}
}

class LeaveSystem{
	int totalLeaves = 20;
	
	LeaveSystem(int leaves){
		leaveSystem(leaves);
	}
	
	void leaveSystem(int leaves) {
		
		try {
			if(leaves > totalLeaves) {
				throw new LeaveQuotaExceededException("Your Leaves are exceeded , Total leaves are: " + totalLeaves);
			}
			else {
				System.out.println("Leave sanctioned successfully");
				totalLeaves -= leaves;
				System.out.println("Remaining Leaves are: " + totalLeaves);
			}
		}
		catch(LeaveQuotaExceededException le) {
			System.out.println(le);
		}
	}
}

public class TestLeaveSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter leaves: ");
		LeaveSystem ls = new LeaveSystem(sc.nextInt());
	}

}
