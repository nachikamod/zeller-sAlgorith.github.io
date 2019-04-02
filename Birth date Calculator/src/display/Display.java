package display;

public class Display {

	int dip;
	
	public Display(int div) {
		dip = div;
	}

	public void disp() {
		System.out.println("Day is: ");
		if(dip == 0) {
			System.out.println("SUNDAY");
		}
		if(dip == 1) {
			System.out.println("MONDAY");
		}
		if(dip == 2) {
			System.out.println("TUESDAY");
		}
		if(dip == 3) {
			System.out.println("WEDNESDAY");
		}
		if(dip == 4) {
			System.out.println("THURSDAY");
		}
		if(dip == 5) {
			System.out.println("FRIDAY");
		}
		if(dip == 6) {
			System.out.println("SATURDAY");
		}
		System.out.println("_______________________________________________________");
		System.out.println("***You can use any date as you want***");
		System.out.println(">>>Thank you for using<<<");
	}
}
