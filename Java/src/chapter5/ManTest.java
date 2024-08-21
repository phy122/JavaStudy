package chapter5;

public class ManTest {

	public static void main(String[] args) {

		Man man = new Man();
		man.age = 40;
		man.name = "James";
		man.isMarried = true;
		man.child = 3;
		
		System.out.println("나이 : " + man.age);
		System.out.println("이름 : " + man.name);
		System.out.println("결혼 여부 : " + man.isMarried);
		System.out.println("자녀 수 : " + man.child);
	}

}
