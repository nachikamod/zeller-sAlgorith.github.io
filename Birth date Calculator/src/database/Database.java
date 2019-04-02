package database;

import swap.Swapper;

public class Database {
	public char[] first_two_digts;
	public char[] last_two_digits;
	public Database(int day, int month, String year){
		
		StringBuffer sb = new StringBuffer(year);
		first_two_digts = new char[2];
		sb.getChars(0, 2, first_two_digts, 0);
		int c = Integer.parseInt(new String(first_two_digts));
	
		last_two_digits = new char[2];
		sb.getChars(2, 4, last_two_digits, 0);
		int d = Integer.parseInt(new String(last_two_digits));
		
		int k = day;
		Swapper sw = new Swapper(k, month, c, d);
		sw.empty();
	}
	
	public void empty() {}
	
}

