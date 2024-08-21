package chapter4;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		for (dan = 1; dan <= 9; dan++) {
			for (times = 0; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan * times );
			}
			System.out.println();
		}
	}
}
