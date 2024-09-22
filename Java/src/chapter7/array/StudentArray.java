package chapter7.array;

public class StudentArray {
    public static void main(String[] args) {
        Student[] school = new Student[3];

        school[0] = new Student(1001,"James");
        school[1] = new Student(1002,"Tomas");
        school[2] = new Student(1003,"Edward");

        for (int i = 0; i < school.length; i++) {
            school[i].showStudentInfo();
        }
    }
    
}