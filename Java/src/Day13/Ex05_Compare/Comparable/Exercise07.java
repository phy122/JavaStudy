package Day13.Ex05_Compare.Comparable;

import java.util.Scanner;

public class Exercise07 {
	
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택>");
			
			int num = sc.nextInt();
			int money = 0;
			
			if(num == 1) {
				System.out.print("예금액 >");
				money = sc.nextInt();
				balance += money;
			}
			else if(num == 2) {
				System.out.print("출금액 >");
				money = sc.nextInt();
				
				balance -= money;
			}
			else if(num == 3) {
				System.out.println("잔고 >" + balance);
			}
			else
				run = false;
		}
		
		System.out.println("프로그램 종료");
		sc.close();
	}

}
