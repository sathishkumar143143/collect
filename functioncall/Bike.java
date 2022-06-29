package functioncall;

public class Bike {
	String brand;
	int price;
	String model;
	int taxPercent;
	public int netPrice(){
	int num=price+price*taxPercent/100;
		return num;
	}
	public void sysout() {
		System.out.println(brand.toUpperCase()+" "+price+" "+model.toUpperCase());
	}
	public int length1(String value) {
		return value.length();
		
	}

}
