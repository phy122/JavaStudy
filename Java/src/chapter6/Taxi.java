package chapter6;

public class Taxi {
	int passengerCount;
	int money;
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(passengerCount + "명이고, 수입은" + money + "입니다.");
	}

}
