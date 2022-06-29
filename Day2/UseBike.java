package Day2;

public class UseBike {
	public static void main(String[]args) {
		Bike S1=new Bike ();
		S1.brand="BAJAJ";
		S1.model="PULSER";
		S1.colour="BLACK";
		S1.price=150000;
		S1.weight=130.8f;
		S1.speed=120;
		S1.height=12.8f;
		S1.milage=45;
		S1.tax=2000;
		S1.discount=5000;
		S1.netamount=(S1.price-S1.tax-S1.discount);
		System.out.println("NETAMOUNT="+S1.netamount);
		System.out.println("BRAND="+S1.brand+"  MODEL="+S1.model+"  COLOUR="+S1.colour+"  PRICE="+S1.price+"  WEIGHT"+S1.weight+"  SPEED="+S1.speed+"  WEIGHT="+S1.weight+"  MILAGE="+S1.milage );
		Bike S2=new Bike ();
		S2.brand="HONDA";
		S2.model="SHINE";
		S2.colour="GREY";
		S2.price=120000;
		S2.weight=110.8f;
		S2.speed=80;
		S2.height=12.8f;
		S2.milage=48;
		S2.tax=1000;
		S2.discount=6000;
		S2.netamount=(S2.price-S2.tax-S2.discount);
		System.out.println("");
		System.out.println("NETAMOUNT="+S2.netamount);
		System.out.println("BRAND="+S2.brand+"  MODEL="+S2.model+"  COLOUR="+S2.colour+"  PRICE="+S2.price+"  WEIGHT"+S2.weight+"  SPEED="+S2.speed+"  WEIGHT="+S2.weight+"  MILAGE="+S2.milage );

	}

}
