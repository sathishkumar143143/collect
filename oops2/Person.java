package oops2;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void eat() {
		System.out.println("Taking food");
	}
	public void sleep() {
		System.out.println("Taking rest");
	}
	
	public Person(String name, int age) {
		this.age=age;
		this.name=name;
	
	}
	public String toString() {
		return "Age: "+age+", Name: "+name;
	}
	
	
      
}
