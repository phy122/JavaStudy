package chapter6.staticex;

public class Student2 {
	private static int CardNum = 100;
	int Card;
	String name;
	
	
	public Student2() {
		CardNum++;
		Card = CardNum;
		
	}
	
	public static int getCardNum() {
		return CardNum;
	}
	public static void setCardNum(int cardNum) {
		CardNum = cardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
