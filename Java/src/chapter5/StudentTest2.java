package chapter5;

public class StudentTest2 {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "안연수";
		
		Student student2 = new Student();
		student2.studentName = "안승연";
		
		System.out.println(student1);	//클래스 이름 @ 주소 값(해시코드값) 출력
		System.out.println(student2);
	}

}
