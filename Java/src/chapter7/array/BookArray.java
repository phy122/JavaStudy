package chapter7.array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];   // Book 클래스형을 객체 배열 생성

        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
    
}
