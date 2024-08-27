package Day13.Ex05_Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/***
 * 1.Movie 영화 클래스 정의
 * 2.Movie 변수는 title, author, price 로 변수 선언
 * 3. 영화를 제목순으로 오름차순 정렬
 *    - String 의 compareTo() 를 활용
 *    	해당문자열.compareTo(비교문자열)
 *    	* 해당 문자열이 사전순으로 더 뒤에 있으면 (양수)
 *    	* 해당 문자열이 사전순으로 더 앞에 있으면 (음수)
 *    	* 같은 문자열이면 0
 */

class Movie implements Comparable<Movie>{
	String title;
	String author;
	int price;
	
	public Movie() {
		this("제목없음", "작자미상", 0);
	}

	public Movie(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Movie o) {
	
		String thisTitle = this.getTitle();
		String comTitle = o.getTitle();
		int result = thisTitle.compareTo(comTitle);
		return -result;
	}
}
public class ComparableEx2 {
	
	public static void main(String[] args) {
		List<Movie> MovieList = new ArrayList<Movie>();
		MovieList.add(new Movie("범죄도시1", "장첸", 10000));
		MovieList.add(new Movie("파일럿", "조정석", 30000));
		MovieList.add(new Movie("인셉션", "디카프리오", 50000));
		MovieList.add(new Movie("베테랑", "황정민", 40000));
		MovieList.add(new Movie("타짜", "조승우", 20000));
		
		// 정렬 전
		System.out.println("* 정렬 전");
		for (Movie movie : MovieList) {
			System.out.println(movie);
		}
		System.out.println("-------------------------------");
		
		// 정렬
		// * Movie 클래스에서 구현한 compareTo() 메소드의 비교기준에 따라서 정렬
		Collections.sort(MovieList);
		
		// 정렬 후
		System.out.println("* 정렬 후");
		for (Movie movie : MovieList) {
			System.out.println(movie);
		}
		System.out.println("-------------------------------");
	}

	

}
