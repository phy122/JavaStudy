package chapter7.array;

public class Student {
    private int studentID;
    private String name;

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(){};

    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo(){
        System.out.println(studentID + "," + name);
    }

}
