package conditionarrayloop;

public class UseCar {
   public static void main (String[]args) {
		Car s1=new Car();
		s1.brand="BMW";
		s1.regno=4251;
		s1.price=25800000;
		Car s2=new Car();
		s2.brand="INNOVA";
		s2.regno=4252;
		s2.price=35600000;
		Car s3=new Car();
		s3.brand="AUDI";
		s3.regno=4253;
		s3.price=55100000;
		Car s4=new Car();
		s4.brand="SWIFT";
		s4.regno=4254;
		s4.price=25300000;
		Car s5=new Car();
		s5.brand="FERRARI";
		s5.regno=4255;
		s5.price=35200000;
		Car s6=new Car();
		s6.brand="LUMBOGINI";
		s6.regno=4256;
		s6.price=550000;
		Car s7=new Car();
		s7.brand="ERTIKA";
		s7.regno=4257;
		s7.price=250000;
		Car s8=new Car();
		s8.brand="KIA";
		s8.regno=4258;
		s8.price=350000;
		Car[]c= {s1,s2,s3,s4,s5,s6,s7,s8};
		for(int i=0;i<c.length;i++) {
//			if(c[i].regno%2==0) {
//				System.out.print(c[i].brand+"  ");
//		}
				if(c[i].regno%2!=0) {
					
					System.out.print(c[i].brand+"  ");
				
			}
			
		}
   }
}
