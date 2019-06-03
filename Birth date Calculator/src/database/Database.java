package database;

import swap.Swapper;

public class Database {
	public Database(int day, int month, String year){
		
		int c = year / 100;
		
		int d = year - (c * 100);
		
		int k = day;
		Swapper sw = new Swapper(k, month, c, d);
		sw.empty();
	}
	
	public void empty() {}
	
}

