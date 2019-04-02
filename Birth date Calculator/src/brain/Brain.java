package brain;

import display.Display;

public class Brain {

	public Brain(int k, int m, int c, int d) {
		int div = 0;
		int ans= 0;
		if(m != 11 && m != 12) {
			int f = k + ((13*m-1)/5)+d+(d/4)+(c/4)-2*c;
			if(f >= 0) {
				div = f % 7;	
			}
			else if(f < 0) {
				for (int i = 0;i <= 10; i++) {
					ans = 7*i;
					if(ans > Math.abs(f)) {
						i = 10;
					}	
				}
				div = f + ans;
			}
		}
		else {
			int f = k + ((13*m-1)/5)+(d-1)+((d-1)/4)+(c/4)-2*c;
			div = f % 7;
			if(f >= 0) {
				div = f % 7;	
			}
			else if(f < 0) {
				for (int i = 0;i <= 10; i++) {
					ans = 7*i;
					if(ans > Math.abs(f)) {
						i = 10;
					}	
				    div = f + ans;
			    }
			}
		}
		Display dp = new Display(div);
		dp.disp();
	}
	
	public void empty() {}
}
