package conditionarrayloop;

public class UseCar3 {
	 public static void main (String[]args) {
		 
			Car s1=new Car();
			s1.brand="BMW";
			s1.regno=4251;
			s1.price=25800000;
			s1.carNo="TN21";
			
			Car s2=new Car();
			s2.brand="INNOVA";
			s2.regno=4252;
			s2.price=35600000;
			s2.carNo="KN11";
			
			Car s3=new Car();
			s3.brand="AUDI";
			s3.regno=4253;
			s3.price=55100000;
			s3.carNo="AP16";
			
			Car s4=new Car();
			s4.brand="SWIFT";
			s4.regno=4254;
			s4.price=25300000;
			s4.carNo="UP15";
			
			Car s5=new Car();
			s5.brand="FERRARI";
			s5.regno=4255;
			s5.price=35200000;
			s5.carNo="KL23";
			
			Car s6=new Car();
			s6.brand="LUMBOGINI";
			s6.regno=4256;
			s6.price=550000;
			s6.carNo="PY25";
			
			Car s7=new Car();
			s7.brand="ERTIKA";
			s7.regno=4257;
			s7.price=250000;
			s7.carNo="AS17";
			
			Car s8=new Car();
			s8.brand="KIA";
			s8.regno=4258;
			s8.price=350000;
			s8.carNo="GA14";
			
			Car[]c= {s1,s2,s3,s4,s5,s6,s7,s8};
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("TN")) {
					System.out.println("TAMIL NADU  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("KN")) {
					System.out.println("KARNATAKA  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("AP")) {
					System.out.println("ANDRAPRADESH  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("UP")) {
					System.out.println("UTHRAPRADESH  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("KL")) {
					System.out.println("KERALA  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("PY")) {
					System.out.println("PONDICHERI  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("AS")) {
					System.out.println("ASSAM  "+c[i].brand);
				}
				
			}
			for(int i=0;i<c.length;i++) {
				if(c[i].carNo.startsWith("GA")) {
					System.out.println("GOA  "+c[i].brand);
				}
				
			}
	 }
}
