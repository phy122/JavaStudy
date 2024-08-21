package chapter4;

public class NestedLoop2 {
	
	public static void main(String[] args) {
		
		for (int i = 3; i <= 7; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			System.out.println();
		}
	}

}
