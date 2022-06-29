package Collection1;

import java.util.ArrayList;

public class arraylist1 {
	public static void main(String[]args) {
		ArrayList<Integer>empId=new ArrayList<>(); 
		empId.add(10);
		empId.add(20);
		empId.add(40);
		empId.add(40);
//		System.out.println(empId);
//		System.out.println(empId.size());
//		System.out.println(empId.get(0));
//		empId.add(1,40);
//		empId.remove(3);
//		empId.set(1, 60);
//		System.out.println(empId);
//		for(int i=0;i<empId.size();i++) {
//	
//		System.out.println(empId.get(i));
//		}  
//		for(Integer g:empId) {
//			System.out.println(g);
//		}
		empId.forEach(z->System.out.println(z));
		}

}
