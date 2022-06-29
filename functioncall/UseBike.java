package functioncall;

public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="pulser";
		b1.price=200000;
		b1.model="ns200";
		b1.taxPercent=15;
		Bike b2=new Bike();
		b2.brand="yamaha";
		b2.price=110000;
		b2.model="rx100";
		b2.taxPercent=10;
		b1.sysout();
		b2.sysout();
		System.out.println(b1.netPrice());
		System.out.println(b2.netPrice());
		System.out.println(b1.length1(b1.brand));
		System.out.println(b1.length1(b2.brand));
        System.out.println(b1.length1(b1.model));
	}

}
