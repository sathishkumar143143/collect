package switchcase;

public class UseCar {
	public static void main (String[]args) {
		Car1 s1=new Car1();
		s1.brand="BMW";
		s1.colour="BLUE";
		s1.price=2500000;
		Car1 s2=new Car1();
		s2.brand="INNOVA";
		s2.colour="WHITE";
		s2.price=3500000;
		Car1 s3=new Car1();
		s3.brand="AUDI";
		s3.colour="RED";
		s3.price=5500000;
		//if (s1.price>s2.price&&s1.price>s3.price) {
			//System.out.println(s1.brand);
			
	//	}
		//else if (s2.price>s1.price&&s2.price>s3.price) {
			//System.out.println(s2.brand);
			
	//	}
		//else if (s3.price>s2.price&&s3.price>s1.price) {
		//	System.out.println(s3.brand);
		//}
		//else {
			//System.out.println("notyet");
		//}
		if (s1.brand==s2.brand&&s1.brand==s3.brand) {
			System.out.println(s1.brand);
			
		}
		else if (s2.brand==s1.brand&&s2.brand==s3.brand) {
			System.out.println(s2.brand);
			
		}
		else if (s3.brand==s2.brand&&s3.brand==s1.brand) {
			System.out.println(s3.brand);
		}
		else {
			System.out.println("notyet");
		}
			
		}
	}



