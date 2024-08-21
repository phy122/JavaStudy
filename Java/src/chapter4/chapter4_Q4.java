package chapter4;

public class chapter4_Q4 {
	public static void main(String[] args) {
		
		int line = 4;
		int space = line/2 + 1;
		int star = 1;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			
			space -= 1;
			star += 2;
			System.out.println();
		}
	}

}
