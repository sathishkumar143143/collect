package functioncall;

public class Car {
	int price;
	String brand;
	String model;
	String color;
	int taxPrice;
	int netPrice;
	int regno;
	
	public int netPrice() {
	return taxPrice+price;	
	}
	
	public String findredcolor() {
		if(color.equals("RED")) {
			return brand+" colour is "+color;
			}
		else {
			return "color is not RED";
		}
		 }
	
	
	public String findprime(int regno) {
		int a=0;
		for(int i=2;i<=regno;i++) {
			if(regno%i==0) {
				a++;
			}
			}
		if(a==1) {
			return "is prime";
		}
		else {
		  return "is not prime";	
		}
		}
	
	public int findluckynum(int[] num) {
		int num1=0;
		for(int i=0;i<=num.length;i++) {
			num1=num1+i;
			
		}
		return  num1;
	}
	public static void main(String[]args) {
		Car s1=new Car();
		s1. price=2000000;
		s1. brand="HUNDAI";
		s1. model="VERNA";
		s1. color="RED";
		s1. taxPrice=20000;
	    s1. regno=1456;
	    
	    Car s2=new Car();
	    s2. price=5000000;
	    s2. brand="BMW";
		s2. model="D1";
		s2. color="BLUE";
		s2. taxPrice=50000;
		s2. regno=1379;
	    
	    Car s3=new Car();
	    s3. price=3000000;
	    s3. brand="HUNDAI";
	    s3. model="VERNA";
	    s3. color="GREEN";
	    s3. taxPrice=30000;
	    s3. regno=1285;
	    
	    System.out.println(s1.netPrice());
	    System.out.println(s2.netPrice());
	    System.out.println(s3.netPrice());
	    System.out.println(s1.findredcolor());
	    System.out.println(s2.findredcolor());
	    System.out.println(s3.findredcolor());
	    System.out.println(s1.findprime(s1.regno));
	    System.out.println(s2.findprime(s2.regno));
	    System.out.println(s3.findprime(s3.regno));

	    
	}
	

}
