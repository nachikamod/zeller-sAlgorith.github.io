package compiler;

import java.util.Scanner;
import database.Database;

public class Compiler {

	private static Scanner d;
	private static Scanner m;
	private static Scanner yr;
	private static Database dt;
	
	public static void main(String[] args) {
		System.out.println("******Day in a week calculator******");
		System.out.println("_______________________________________________________");
		System.out.println("***Enter Birthdate***");
		System.out.println(">>Day: ");
		d = new Scanner(System.in);
		int day = d.nextInt();
	
		System.out.println(">>Month: (Dont use zeros before any variable i.e. 01, 02, etc.)");
		m = new Scanner(System.in);
		int month = m.nextInt();
		
		System.out.println(">>Year: ");
		yr = new Scanner(System.in);
		String year = yr.nextLine();
		System.out.println("_______________________________________________________");
		
		System.out.println("Entered Birthdate is: "+day+"/"+month+"/"+year);
		System.out.println("_______________________________________________________");
		
		dt = new Database(day, month, year);
		dt.empty();

	}

}
