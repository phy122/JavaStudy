package Day03;

import java.util.Scanner;

public class Ex13_Gugu {
	
	public static void main(String[] args) {
		//구구단 (1~9)
		//원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
		//입력 : 4
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하시오.");
		int x = sc.nextInt();

		
		for (int i = 1; i <= 9; i++) {
			int result = x * i;
			System.out.println(x + "x" + i + "=" +result);
		}
		
		sc.close();
	}

}
