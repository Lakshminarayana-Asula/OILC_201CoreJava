import java.util.*;

class Dice{
	int faceValue;
	
	void rolls() {
		Random r = new Random();
		faceValue = r.nextInt(6) + 1;
	}
	
}

class Player{
	String name;
	int pValue;
	
	void accept(String name) {
		this.name = name;
	}
	
	void throwDice(Dice d1, Dice d2) {
		d1.rolls();
		d2.rolls();
		
		pValue = d1.faceValue + d2.faceValue;
		System.out.println(name + " values are: " + d1.faceValue + " " + d2.faceValue + " = " + pValue);
	}
}

public class DiceGame{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First player Name: ");
		String player1 = sc.next();
		System.out.println("Enter Second player Name: ");
		String player2 = sc.next();
		
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		Player p1 = new Player();
		Player p2 = new Player();
		p1.accept(player1);
		p2.accept(player2);
		p1.throwDice(d1, d2);
		p2.throwDice(d1, d2);
		
		if(p1.pValue > p2.pValue) {
			System.out.println(p1.name + " Wins the Game ");
		}
		else if(p1.pValue < p2.pValue) {
			System.out.println(p2.name + " Wins the Game ");
		}
		else {
			System.out.println("Try Agian");
		}

	}

}

