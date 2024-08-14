package Day07.Review;

public class Ex04_Lotto {
	
	public static void main(String[] args) {
		// Math.random() : 0.XXXXX ~ 0.9XXXXX 사이의 난수를 반환하는 메소드
		double random = Math.random();
		System.out.println(random);
		
		// 1~6 사이의 정수 : 주사위
		
		//(int)(Math.random() * 10)			:0~9
		//(int)(Math.random() * 10) + 1		:1~10
		// ?????							:1~6
		System.out.println((int)(Math.random() * 10) + 1);
		
		//(int)(Math.random() * 6) 			:0~5
		//(int)(Math.random() * 6) 	 +1		:1~6
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 : " + dice);
		
		// (공식) : (int) (Math.random() * [개수]) + [시작숫자]
		
		//1~20 사이의 랜덤수
		int dice2 = (int)(Math.random() * 20) + 1;
		System.out.println("랜덤 : " + dice2);
		// -20~20 사이의 랜덤수
		int dice3 = (int)(Math.random() * 41) - 20;
		System.out.println("랜덤 : " + dice3);
		//1~45 사이의 랜덤 6개를 배열에 저장하시오.
		int arr[] = new int[6];
		
		//중복제거, 
		// (과제) 오름차순 정렬
		for (int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random() * 45 + 1);
			arr[i] = r;
			
			for(int j = i-1; j >= 0; j-- ) {
				if(arr[j] == arr[i]) {
					i--;
					break;
				}
			}
			
		
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	

}
