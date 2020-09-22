package aaPWLab;
import java.util.Scanner;

public class Direction {
	private int xAxis;
	private int yAxis;
	
	
	public Direction(int x, int y) {
		xAxis = x;
		yAxis = y;
	}
	
	public void getDirectionFromUser() {
		Scanner in = new Scanner(System.in);

		System.out.println("North, South, East, West? ");
		String n = in.next();
		if (n.equals("North")) {
			North();
		}
		if (n.equals("South")) {
			South();
		}
		if (n.equals("East")) {
			East();
		}
		if (n.equals("West")) {
			West();
		}
		else {
			System.out.println("Please be clear with directions...");
		}
		System.out.println("( " + getX() + ", " + getY() + ")");
	}
	
	public void North() {
		yAxis = yAxis + 1;
	}
	
	public void South() {
		yAxis = yAxis - 1;
	}
	
	public void East() {
		xAxis = xAxis + 1;
	}
	
	public void West() {
		xAxis = xAxis - 1;
	}
	
	public int getX() {
		return xAxis;
	}
	
	public int getY() {
		return yAxis;
	}
	


}


