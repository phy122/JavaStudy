package chapter6.staticex;

public class Student {
	private static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student() {
		serialNum++;		//학생이 생성될 떄마다 증가
		studentID = serialNum;	//증가된 값을 학번 인스턴스 변수에 부여
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {
		int i = 10;
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	
	

}
