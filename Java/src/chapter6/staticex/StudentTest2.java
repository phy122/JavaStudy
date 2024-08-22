package chapter6.staticex;

public class StudentTest2 {
	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setName("이지원");
		System.out.println(Student2.getCardNum()); //serialNum 변수의 초깃값 출력
		System.out.println(studentLee.name + "학번 : " + studentLee.Card);
		
		Student2 studentSon = new Student2();
		studentSon.setName("손수경");
		System.out.println(Student2.getCardNum());
		System.out.println(studentSon.name + "학번 : " + studentSon.Card);
	}

}
