package interface1;

public class UseSportsCar {
	public static void main(String[]args) {
		SportsCar s1=new SportsCar();
		System.out.println(s1.brake("Disk Brake"));
		System.out.println(s1.engineCC(1200));
		s1.Speed(150);
		s1.milage();
		
	}

}
