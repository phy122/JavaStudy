package chapter6;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		Student studentEdward = new Student("Edward", 10000);
		
		Bus bus100 = new Bus(100);	//노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100);	//제임스가 100번 버스를 탐
		studentJames.showInfo();	//제임스 정보 출력
		bus100.showInfo();	//버스 정보 출력
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
		
		Taxi taxi = new Taxi();
		studentEdward.takeTaxi(taxi);
		studentEdward.showInfo();
		taxi.showInfo();
	}

}
