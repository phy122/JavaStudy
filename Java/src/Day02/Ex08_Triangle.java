package Day02;

import java.util.Scanner;

public class Ex08_Triangle {
	
	//1. 밑변과 높이를 입력받는다.
	//2. 밑변과 높이를 입력받는다.
	//3. 삼각형의 넓이를 계산한다.
	//4. 결과 출력
	
	public double TRI(double x, double y) {
		double result = x * y / 2;
		return result;
	}
	
	public static void main(String[] args) {
		//삼각형 넓이 : (밑변) X (높이) / 2
		//밑변과 높이를 입력받아서 삼각형의 넓이를 계산하고 출력하시오.
		
		Ex08_Triangle tr = new Ex08_Triangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		double x = sc.nextDouble(); 
		
		System.out.print("y: ");
		double y = sc.nextDouble(); 
		
		sc.close();
		
		double answer = tr.TRI(x, y);
		
		System.out.println("answer : " + answer);
		

	}

}
