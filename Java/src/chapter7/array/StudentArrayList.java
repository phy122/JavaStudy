package chapter7.array;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> school = new ArrayList<>();
        
        school.add(new Student(1001,"James"));
        school.add(new Student(1002,"Tomas"));
        school.add(new Student(1003,"Edward"));

        for (Student student : school) {
            student.showStudentInfo();
        }
    }
    
}
