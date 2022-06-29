package switchcase;

public class UseCar1 {
		public static void main (String[]args) {
			Car1 s1=new Car1();
			s1.brand="BMW";
			s1.colour="BLUE";
			s1.price=3500000;
			Car1 s2=new Car1();
			s2.brand="INNOVA";
			s2.colour="WHITE";
			s2.price=3500000;
			//if(s1.price>s2.price) {
			 //System.out.println(s1.brand);
			//}
			//else {
			 //System.out.println(s2.brand);
			 
			//}
			//if(s1.price<s2.price) {
				//System.out.println(s2.brand);
			//}
			//else {
			  //System.out.println(s2.brand);
			//}
			//}
		if(s1.price==s2.price) {
			System.out.println(s1.brand+" equal "+s2.brand);
		}
		else {
		  System.out.println(s2.brand);
		}	
		
		}
}
