package conditionarrayloop;

public class UseBike {
	public static void main (String[]args) {
		 
		Bike s1=new Bike();
		s1.brand="ROYALENFIELD";
		s1.isPetrol=true;
		s1.price=258000;
	
		
		Bike s2=new Bike();
		s2.brand="PULSER";
		s2.isPetrol=false;
		s2.price=356000;
		
		
		Bike s3=new Bike();
		s3.brand="APACHI";
		s3.isPetrol=true;
		s3.price=551000;

		
		Bike s4=new Bike();
		s4.brand="YAMAHA";
		s4.isPetrol=true;
		s4.price=253000;
	
		
		Bike s5=new Bike();
		s5.brand="TVS";
		s5.isPetrol=false;
		s5.price=352000;
	
		
		Bike s6=new Bike();
		s6.brand="DUCATI";
		s6.isPetrol=true;
		s6.price=550000;
	
		
		Bike s7=new Bike();
		s7.brand="HIMALAYAN";
		s7.	isPetrol=false;
		s7.price=6500000;

		
		Bike s8=new Bike();
		s8.brand="HONDA";
		s8.isPetrol=true;
		s8.price=3500000;
		String a="";
	    int max=0;
	   
		Bike[]B= {s1,s2,s3,s4,s5,s6,s7,s8};
		for(int i=0;i<B.length;i++) {
			if(B[i].price>max) {
				max=B[i].price;
		      a=B[i].brand;
			}
			}
	         System.out.println("MAX PRICE "+a);
	         	int min=B[0].price;
				for(int i=0;i<B.length;i++) {
					if(B[i].price<min) {
						min=B[i].price;
				      a=B[i].brand;
					}
					}
						System.out.println("MIN PRICE "+a);
						
						for(int i=0;i<B.length;i++) {
							if(B[i].price<500000) {
								System.out.println("LESSER THAN 500000 "+B[i].brand);
							}}

						for(int i=0;i<B.length;i++) {
							if(B[i].price>500000) {
								System.out.println("GREATER THAN 500000 "+B[i].brand);
							}}
							
	}	
}
