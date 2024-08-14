package Day03;

public class Ex14_GuguAll {
	
	public static void main(String[] args) {
		//단에 대한 반복 : 1~9
		//각 단의 곱 : 1~9
		
		//중첩 반복문(이중 반복문)
		//A X B
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.print(i + "X" + j + "=" + result);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
