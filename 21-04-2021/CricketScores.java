
public class CricketScores {
	static String getDisplayDetailes(int runs, double overs) {
		String x = "";
		int count, q, r;
		count = (int)(overs * 10);
		q = count / 10;
		r = count % 10;
		double balls = (q * 6) + r;
		if((balls < 100) || (runs < 100)){
			x = x + runs + " runs in " + (int)balls + " balls " + " @ " + String.format("%.2f", (runs / balls)) + " runs per ball";
		}
		else {
			x = x + runs + " runs in " + overs + " overs " + " @ " + String.format("%.2f", (runs / overs)) + " runs per over";
		}
		return x;
	}
	public static void main(String[] args) {
		System.out.println(getDisplayDetailes(33, 3.2));	
	}
}
