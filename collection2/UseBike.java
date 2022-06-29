package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[]args) {
	  HashMap<String,String>bike=new HashMap<>();
		bike.put("12345qwe", "hundai");
		bike.put("12346qwe", "pulser");
		bike.put("12347qwe", "yamaha");
		bike.put("12348qwe", "Royal Enfield");
//		Iterator<String> b=bike.values().iterator();
//		while(b.hasNext()) {
//			System.out.println(b.next());
//		}
		Iterator<String> a=bike.keySet().iterator();
		while(a.hasNext()) {
			if(a.next().equals("12348qwe")) {
				a.remove();
			
		
		
			}
	   }
		bike.forEach((h,b)->System.out.println(h+b));
	}

}
