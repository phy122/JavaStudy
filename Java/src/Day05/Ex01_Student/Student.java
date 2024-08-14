package Day05.Ex01_Student;

public class Student {
	//학생의 속성 : 이름, 나이, 학번, 전공
	//학생의 행동 : 공부하기, 성적 평균 구하기
	
	//변수
	String name;
	int age;
	String stdNo;
	String major;
	
	//생성자
	public Student() {
		this("이름없음", 1, "000000", "없음");
	}
	
	public Student(String name, int age, String stdNo, String major) {
		this.name = name;
		this.age = age;
		this.stdNo = stdNo;
		this.major = major;
	}
	//메소드
	// * 접근지정자 반환타입 메소드명9(매개변수)
	// - 공부하기
	// * void : 반환타입 없음(return 생략가능)
	//		-void로 지정해도 return을 메소드를 종료시키는 용도로 쓸 수 있다.
	public void study(String subject) {
		System.out.println(subject + "(을/를) 공부합니다.");
		
	}
	// - 성적 평균 구하기
	// 메소드 오버 로딩
	
	public double getAverage(int score1, int score2) {
		double average = 0.0;
		int sum = 0;
		average = (score1 + score2)/2;
		return average;
		
	}
	
	public double getAverage(int score1, int score2, int score3) {
		double average = 0.0;
		int sum = 0;
		average = (score1 + score2 + score3)/3;
		return average;
		
	}
	public double getAverage(int[] scores) {
		double average = 0.0;
		int sum = 0;
		
		// 합계 구하기
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
//		for (int score : scores) {
//			sum += score;
//			
//		}
		System.out.println();
		average = (double) sum / scores.length;
		return average;
	}
	
	

}
