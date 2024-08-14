package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		
		int number[] = {12,13,485,52,68,48};
		
		System.out.println("a + b = " + calculator.Plus(a,b));
		System.out.println("a - b = " + calculator.minus(a,b));
		
		System.out.print("x : ");
		double x = sc.nextDouble();
		System.out.print("y : ");
		
		double y = sc.nextDouble();
		
		System.out.println("x * y = " + calculator.multiple(x,y));
		System.out.printf("x * y = %5.2f \n", calculator.multiple(x,y));
		
		System.out.println("x / y = " + calculator.divide(x,y));
		System.out.printf("x / y = %5.2f \n", calculator.divide(x,y));
		
		System.out.println("x % y = " + calculator.remain(x,y));
		
		//printf("포맷", 변수)  : %X,Y(리터럴)
		// - X : 양수 - 크기만큼 칸을 지정하고 오른쪽으로 정렬
		//	   : 음수 - 크기만큼 칸을 지정하고 왼쪽으로 정렬
		// - Y : 지정한 크기만큼 소수점 아래 자리수를 표현(반올림)
		// * (리터럴) : %d (정수), %f (실수), %s (문자열)
		
		System.out.println("합계 : " + calculator.sum(number));
		System.out.println("평균 : " + calculator.avg(number));
	}

}
