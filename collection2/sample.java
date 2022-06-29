package collection2;

import java.util.HashMap;
import java.util.Iterator;

public class sample {
	public static void main(String[]args) {
		HashMap<Integer,String>student=new HashMap<>();
		student.put(562,"mani");
		student.put(456,"praveen");
		student.put(543,"murali");
		student.put(587,"surya");
//		System.out.println(student.get(562));
//		System.out.println(student.remove(543));
////		System.out.println(student);
//		for(Integer s:student.keySet()) {
//			System.out.println(s);
//		}
//		for(String h:student.values()) {
//			System.out.println(h);
//		}
//		student.forEach((s,v)->System.out.println(s+" "+v));
//			
//		Iterator<Integer> a=student.keySet().iterator();
//		while(a.hasNext()) {
//		System.out.println(a.next());
//			
//		}
		Iterator<String> b=student.values().iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}

}
