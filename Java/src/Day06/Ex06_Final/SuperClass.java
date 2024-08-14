package Day06.Ex06_Final;

public class SuperClass {
	
	//final 메소드
	public final void finalmethod() {
		System.out.println("final 메소드 입니다.");
		
	}

}

class Subclass extends SuperClass{
	
	// * final 메소드는 오버라이딩 할 수 없다.
//	@Override
//	public void finalMethod() {
//		System.out.println("final 메소드는 오버라이딩 불가");
//		
//	}
}
