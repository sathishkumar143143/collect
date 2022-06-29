package switchcase;

public class UseCar2 {
	public static void main (String[]args) {
		Car1 s1=new Car1();
		s1.brand="BMW";
		s1.colour="BLUE";
		s1.price=3500000;
		Car1 s2=new Car1();
		s2.brand="Innova";
		s2.colour="WHITE";
		s2.price=3500000;
	  //if(s1.brand.equals(s2.brand)) {
		// System.out.println(s1.brand); 
	  //}
	  //else {
        // System.out.println(s2.brand);	  
	  //}
		// if(s1.colour.equals("BLUE")) {
			// System.out.println(s1.brand); 
		  //}
		  //else {
	        // System.out.println(s2.brand);	  
		  //}
		 //if(s1.brand.charAt(0)==s2.brand.charAt(0)) {
			// System.out.println("BOTH BRANS START WITH EQUAL LETTER"); 
		  //}
		  //else {
	        // System.out.println("NOT YET");	  
		  //}
		 //if(s1.brand.startsWith("B")) {
			// System.out.println(s1.brand); 
		  //}
		  //else {
	       //  System.out.println(s2.brand);	  
		  //}
		// if(s1.brand.endsWith("E")) {
			// System.out.println(s1.brand); 
		//  }
		  //else {
	        // System.out.println(s2.brand);	  
		  //}
		 if(s2.brand.contains("a")||s2.brand.contains("e")||s2.brand.contains("i")||s2.brand.contains("o")||s2.brand.contains("u")) {
			 System.out.println(s2.brand); 
		  }
		  else {
	         System.out.println(s1.brand);	  
		  }
	  }
	
	}
	


