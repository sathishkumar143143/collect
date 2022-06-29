package switchcase;

public class UseCar3 {
	public static void main (String[]args) {
		Car1 s1=new Car1();
		s1.brand="BMW";
		s1.colour="BLUE";
		s1.price=3500000;
		Car1 s2=new Car1();
		s2.brand="Innov";
		s2.colour="WHITE";
		s2.price=350000;
	 if(s1.brand.charAt(s1.brand.length()-1)==s2.brand.charAt(s2.brand.length()-1)) {
		 System.out.println("EQUALS"); 
		 }
		  else {
	          System.out.println("NOT YET");	

		//if (s1.price>1000000) {
			//System.out.println(s1.price+10000);
			
	//	}
		//else {
			//System.out.println(s1.price+10000);
		//}
		//if (s1.price<100000) {
			//System.out.println(s1.price-10000);
			
		}
		//else {
			//System.out.println(s1.price-10000);
		
      	}
	}

	
	
