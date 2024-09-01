package chapter6;

public class Car {
	public static int serialNum = 10000;
	public int CarNum;
	
	public Car() {
		serialNum++;
		CarNum = serialNum;
	}

	public int getCarNum() {
		return CarNum;
	}

	public void setCarNum(int carNum) {
		CarNum = carNum;
	}
	
	
	
	

}
