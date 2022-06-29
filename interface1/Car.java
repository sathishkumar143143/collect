package interface1;

public abstract class Car implements Vehicle {
	public abstract String brake(String brake);
	public int engineCC(int num) {
		return num;
	}
	public void Speed(int num) {
		System.out.println(num);
	}

}
