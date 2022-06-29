package conditionarrayloop;

public class UseBike1 {
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
		Bike[]B= {s1,s2,s3};
//       for(int i=0;i<B.length;i++) {
//    	   if(s1.price>s2.price&&s1.price>s3.price) {
//    	   
//    	   
//    		   System.out.println(s1.price+" "+s1.brand);
//    		   
//    	   }
//    	   else  if(s2.price>s1.price&&s2.price>s3.price) {
//    		   System.out.println(s2.price+" "+s2.brand);
//    		   
//    	   }
//    	   else   if(s3.price>s2.price&&s3.price>s1.price) {
//    		   System.out.println(s3.price+" "+s3.brand);
//    		   
//    	   }}
//		for(int i=0;i<B.length;i++) {
//			if(B[i].price>500000) {
//				System.out.println(B[i].price+5000+" "+B[i].brand);
//				
//			}
//			else if(B[i].price<500000) {
//				System.out.println(B[i].price-5000+" "+B[i].brand);
//				
//			}
////			
////		}
//		for(int i=0;i<B.length;i++) {
//			if(B[i].isPetrol==true) {
//				System.out.println("IS PETROL   "+B[i].brand);
//				
//			}
//			else {
//				System.out.println("IS NOT PETROL   "+B[i].brand);
//			}
//			
////		}
//		for(int i=0;i<B.length;i++) {
//			if(B[i].price<500000) {
//				System.out.println(B[i].brand+" "+B[i].price+" "+"TAX FREE");
//				
//			}
//			else if(B[i].price>500000) {
//				System.out.println(B[i].brand+"  "+B[i].price+"  "+(B[i].price+50000));
//				
//			}
//			
//		}
		int max=0;
		String b="";
	   for(int i=0;i<B.length;i++) {
		   if(B[i].brand.length()>max) {
			   max=B[i].brand.length();
			   b=B[i].brand;
		   }
	   }
		   System.out.println(b);
			
}}
