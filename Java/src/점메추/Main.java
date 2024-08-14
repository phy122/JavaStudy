package 점메추;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MenuManager manumanager = new MenuManager();
		
		logo();
		
		while(true) {
			System.out.println("::::::::::::::::::::::");
			System.out.println("\n1. 메뉴 정하기");
			System.out.println("2. 메뉴 수정하기");
			System.out.println("3. 메뉴 삭제하기");
			System.out.println("4. 메뉴 전체출력");
			System.out.println("5. 종류별로 메뉴 출력하기");
			System.out.println("6. 종류별 메뉴 추천★");
			System.out.println("7. 메뉴 추천★");
			System.out.println("0. 종료하기");
			
			System.out.print("\n번호 선택(0~7)");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.print("메뉴 종류 (예. 한식, 중식):");
				String type = sc.nextLine();
				System.out.print("메뉴 이름:");
				String name = sc.nextLine();
				System.out.print("메뉴 가격:");
				double price = sc.nextDouble();
				System.out.print("식당 거리 (km):");
				double distance = sc.nextDouble();
				manumanager.addMenu(type,name, price, distance);
				break;
				
			case 2:
				System.out.print("수정할 메뉴 이름:");
				String oldName = sc.nextLine();
				System.out.print("(수정) 메뉴 종류:");
				String newType = sc.nextLine();
				System.out.print("(수정) 메뉴 이름:");
				String newName = sc.nextLine();
				System.out.print("(수정) 메뉴 가격:");
				double newPrice = sc.nextDouble();
				System.out.print("(수정) 식당 거리 (km):");
				double newDistance = sc.nextDouble();
				manumanager.UpdateMenu(oldName,newType, newName, newPrice, newDistance);
				break;
				
			case 3:
				System.out.print("삭제할 메뉴 이름");
				String deleteName = sc.nextLine();
				manumanager.deleteMenu(deleteName);
				break;
				
			case 4:
				manumanager.printAllMenus();
				break;
				
			case 5:
				System.out.println("출력할 메뉴 종류(예. 한식, 중식): ");
				String typeToPrint = sc.nextLine();
				manumanager.printMenusByType(typeToPrint);
				break;
				
			case 6:
				System.out.println("추천 받을 음식 종류 (예. 한식, 중식): ");
				String typeToRecommend = sc.nextLine();
				if(typeToRecommend.isEmpty()) {
					typeToRecommend = null;
				}
				manumanager.recommendMenu(typeToRecommend);
				break;
				
			case 7:
				System.out.println(":::::::::: 점메추 ::::::::::");
				manumanager.recommendMenu(null);
				break;
				
			case 0:
				System.out.println("Exiting");
				sc.close();
				return;

			default:
				System.out.println("유효한 번호를 입력해주세요!");
			}
		}
		
	}
	
	public static void logo() {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("점 심 메 뉴 추 천");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
	}

}
