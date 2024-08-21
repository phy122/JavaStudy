package chapter4;

public class chapter4_Q3 {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i <= j) {
					break;
				}
				System.out.println(i + "X" + j + "=" + i * j);
			}
			System.out.println();
		}
	}

}

