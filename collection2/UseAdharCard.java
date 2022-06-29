package collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseAdharCard {
	public static void main(String[]args) {
		AdharCard s1=new AdharCard("MURALI",24,1234567891,"MALE","MANI");
		AdharCard s2=new AdharCard("DEEPIKA",23,1234567892,"FEMALE","MUTHU");
		AdharCard s3=new AdharCard("AJITH",16,1234567893,"MALE","MAGESH");
		AdharCard s4=new AdharCard("SHREYA",17,1234567894,"FEMALE","PRAKASH");
		AdharCard s5=new AdharCard("VIKRAM",34,1234567895,"MALE","SURESH");
		AdharCard s6=new AdharCard("PRABHU",67,1234567896,"MALE","KARTHI");
		AdharCard s7=new AdharCard("KOUSHIK",74,1234567897,"MALE","DANUSH");
		AdharCard s8=new AdharCard("BALAJI",45,1234567898,"MALE","SIVA");
		AdharCard s9=new AdharCard("PRAVEENA",43,1234567899,"FEMALE","MURUGESAN");
		AdharCard s10=new AdharCard("VIJAYA",21,1234567900,"FEMALE","MAARAN");
		HashMap<Long,AdharCard>adhar=new HashMap<>();
		adhar.put(s1.getAdharNo(),s1);
		adhar.put(s2.getAdharNo(),s2);
		adhar.put(s3.getAdharNo(),s3);
		adhar.put(s4.getAdharNo(),s4);
		adhar.put(s5.getAdharNo(),s5);
		adhar.put(s6.getAdharNo(),s6);
		adhar.put(s7.getAdharNo(),s7);
		adhar.put(s9.getAdharNo(),s9);
		adhar.put(s8.getAdharNo(),s8);
		adhar.put(s10.getAdharNo(),s10);
		Iterator<AdharCard>s=adhar.values().iterator();
		while(s.hasNext()) {
			if(s.next().getFathersName().startsWith("K")) {
				s.remove();
			}
	}
//		for(Long a:adhar.keySet()) {
//			if(adhar.get(a).getAge()<25) {
//				System.out.println(adhar.get(a));
//			}
////		}
//		adhar.forEach((a,h)->{if(h.getGender().equals("FEMALE")) {
//		System.out.println(h);
//		}
//		});
//	}
   ArrayList<AdharCard>d=new ArrayList<>() ;
   for(AdharCard f:adhar.values()) {
	   if(f.getGender().equals("FEMALE")) {
		 d.add(f);  
	   }
   }
   d.forEach(x->System.out.println(x));
 }
}
