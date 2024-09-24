package chapter7.array;

public class Book {
    private String bookName;
    private String author;

    public Book(){} // 디폴트 생성자

    public Book(String bookName, String author){
        this.bookName = bookName;
        this.author = author;
    } // 책 이름과 저자 이름을 매개변수로 받는 생성자

    // 사용할 멤버 변수 값을 가져오거나 지정할 수 있음
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookName + "," + author);
    } // 책 정보를 출력해 주는 메소드
    //testestsetestsetes
}
