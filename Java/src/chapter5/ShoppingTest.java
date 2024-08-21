package chapter5;

public class ShoppingTest {

	public static void main(String[] args) {

		Shopping shopping = new Shopping();
		shopping.orderNum = 201813120001L;
		shopping.orderID = "abc123";
		shopping.date = "2018년 3월 12일";
		shopping.name = "홍길순";
		shopping.number ="PD0345-12";
		shopping.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 변호 : " + shopping.orderNum);
		System.out.println("주문자 아이디 : " + shopping.orderID);
		System.out.println("주문 날짜 : " + shopping.date);
		System.out.println("주문자 이름 : " + shopping.name);
		System.out.println("주문 상품 번호 : " + shopping.number);
		System.out.println("배송 주소 : " + shopping.address);
	}

}
