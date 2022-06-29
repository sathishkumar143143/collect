package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCustomer {
	public static void main(String[]args) {
		Customer c1=new Customer("SURYA","dr23edt521",1234567895,24,"MALE");
		Customer c2=new Customer("VIKRAM","re235wg27",1234567098,45,"MALE");
		Customer c3=new Customer("DIVYA","wgwt2u1811",1234567980,56,"FEMALE");
		Customer c4=new Customer("SIVAKUMAR","gw61uhq8",1234567898,32,"MALE");
		Customer c5=new Customer("DEVAPRIYA","wh6178qh",1238765432,16,"FEMALE");
		HashMap<Integer,Customer>customer=new HashMap<>();
		customer.put(c1.getAccountNumber(),c1);
		customer.put(c2.getAccountNumber(),c2);
		customer.put(c3.getAccountNumber(),c3);
		customer.put(c4.getAccountNumber(),c4);
		customer.put(c5.getAccountNumber(),c5);
		customer.forEach((a,b)->System.out.println(a+""+b));
		System.out.println(" ");
		Iterator<Customer>gender=customer.values().iterator();
		while(gender.hasNext()) {
			if(gender.next().getGender().equals("FEMALE")) {
				gender.remove();
			}
		}
		customer.forEach((a,s)->System.out.println(a+" "+s));
     
	}

}
