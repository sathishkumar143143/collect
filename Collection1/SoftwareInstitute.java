package Collection1;

import java.util.ArrayList;

public class SoftwareInstitute {
	public static void main(String[]args) {
		ArrayList<String>course=new ArrayList<>(); 
		course.add("java");
		course.add("javascript");
		course.add("python");
		course.add("angular");
		course.add("reactjs");
		for(int i=0;i<course.size();i++) {
			System.out.println(course.get(i).charAt(course.get(i).length()-1));
		}
	for(String a:course) {
		System.out.println(a.subSequence(1, a.length()-1));
		
	}
	course.forEach(z->System.out.println(z));
	}
}
