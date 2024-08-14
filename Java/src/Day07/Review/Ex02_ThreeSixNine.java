package Day07.Review;

public class Ex02_ThreeSixNine {
	
	public static void main(String[] args) {
		//정수 1~100 까지 수를 반복하여 출력하면서,
		//해당 수가 3 또는 6 또는 9가 될 때는 
		//자리수마다 369가 되는 개수 만큼 정수 대신 "*" 출력하는 프로그램을 작성하시오.
		
		for (int i = 1; i <= 100; i++) {
			
			int count = 0;
			
			int x = i / 10;
			int y = i % 10;
			
//			if(x == 3 || x == 6 || x == 9) {
//				count++;
//			}
			
//			if(y == 3 || y == 6 || y == 9) {
//				count++;
//			}
//			if(x == 3 || x == 6 || x == 9) {
//				System.out.println("**");
//			}
//			else if(y == 3 || y == 6 || y == 9) {
//				System.out.println("*");
//			}
//			else {
//				System.out.println(i + " ");
//			}
			boolean x369 = x == 3 || x == 6 || x == 9;
			boolean y369 = y == 3 || y == 6 || y == 9;
			
			if(x369 && y369)
				System.out.println("**");
			else if(x369 || y369)
				System.out.println("*");
			else
				System.out.println(i);
		}
	}

}
