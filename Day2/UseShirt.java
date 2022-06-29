package Day2;

public class UseShirt {
	public static void main (String[]args) {
		Shirt S1=new Shirt();
		S1.name="TOMMY";
		S1.colour="BLUE";
		S1.size=20;
		S1.price= 150;
		S1.tax=10;
		S1.discount=15;
		S1.netprice=(S1.price-S1.tax-S1.discount);
		System.out.println("NAME="+S1.name);
		System.out.println("COLOUR="+S1.colour);
		System.out.println("SIZE="+S1.size);
		System.out.println("PRICE="+S1.price);
		System.out.println("TAX="+S1.tax);
		System.out.println("DISCOUNT="+S1.discount);
		System.out.println("NETPRICE="+S1.netprice);
		
	}

}
