package swap;

import brain.Brain;

public class Swapper {
	
	public static int m = 0;
	private Brain b;

	public Swapper(int k, int month, int c, int d) {
		if (month != 1 && month != 2) {
			m = month - 2;
		}
		else {
			m = month + 10;
		}
		b = new Brain(k, m, c, d);
		b.empty();
	}
	
	public void empty() {}
}
