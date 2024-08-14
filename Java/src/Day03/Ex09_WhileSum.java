package Day03;

public class Ex09_WhileSum {
	
	public static void main(String[] args) {
		//1부터 1000까지 합계를 구하시오.
		// 1+2+3+ ...+999+1000 = ????
		
		int a = 1;
		int sum = 0;
		//a : 1 2 3 4 ... 1000
		//sum = sum + a		: ????
		//		?	+ 1
		//		?	+ 2
		
		while(a <= 1000) {
			//방법1
//			sum = sum + a;
//			a++;
			
			//방법2
			//sum = sum + a++;
			
			//방법3
			sum += a++;
		}
		System.out.println("합계 : " + sum);
	}

}
