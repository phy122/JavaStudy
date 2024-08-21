package chapter5;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {
		
	}
	public Person(String pname) { 
		name = pname;
	}
	
	public Person(String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
