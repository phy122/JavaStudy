package chapter5;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum1 = add(num1,num2);
		int sum2 = mis(num1,num2);
		int sum3 = div(num1,num2);
		int sum4 = mul(num1,num2);
		
		System.out.println(num1 + "+" + num2 +"=" + sum1 + "입니다.");
		System.out.println(num1 + "-" + num2 +"=" + sum2 + "입니다.");
		System.out.println(num1 + "/" + num2 +"=" + sum3 + "입니다.");
		System.out.println(num1 + "*" + num2 +"=" + sum4 + "입니다.");
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;	//결과 값 반환
	}
	public static int mis(int n1, int n2) {
		int result = n1 - n2;
		return result;	//결과 값 반환
	}
	public static int div(int n1, int n2) {
		int result = n1 / n2;
		return result;	//결과 값 반환
	}
	public static int mul(int n1, int n2) {
		int result = n1 * n2;
		return result;	//결과 값 반환
	}

}
