package switchcase;

public class UseCar4 {
	public static void main (String[]args) {
		Car1 s1=new Car1();
		s1.brand="BMW";
		s1.colour="BLUE";
		s1.price=2500000;
		Car1 s2=new Car1();
		s2.brand="INNOVA";
		s2.colour="WHITE";
		s2.price=50000000;
		Car1 s3=new Car1();
		s3.brand="AUDI";
		s3.colour="RED";
		s3.price=500000;
		if (s1.price>10000000) {
			System.out.println(s1.price+10000);
			
		}
		else if (s2.price<1000000) {
			System.out.println(s2.price-10000);
			
		}
		else if (s3.price==500000) {
			System.out.println(s3.price+10000-1000);
			
		}
		else {
			System.out.println("not yet");
		}
	}

}
