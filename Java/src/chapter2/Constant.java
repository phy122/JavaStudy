package chapter2;

public class Constant {
	public static void main(String[] args) {
		//상수는 값을 변경할 수 없음
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
