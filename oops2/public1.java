package oops2;

public class public1 {
	public class cycle {
		String brand;
		int price;
		public String brake() {
		return "BRAKE DECREASE THE SPEED";
		}
	    public int speed(int speed) {
	    return speed;
	    	
	    }
	    public cycle(String brand,int price) {
	    this.brand=brand;
	    this.price=price;
	    }
	    public String toString() {
	    
	    	return brand+" "+price;
	    }
	}
	class bike extends cycle{
		int enginecc;
	 public bike(String brand,int price,int enginecc) {
		 super(brand,price);
		 this.enginecc=enginecc;
	 }
	 public String toString() {
		 return super.toString()+" "+enginecc;
	 }
	 }


}
