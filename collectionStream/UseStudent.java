package collectionStream;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student s1=new Student("mani",47,"B.E",2013,true,30);
		Student s2=new Student("murali",37,"B.E",2016,true,45);
		Student s3=new Student("priya",45,"MBA",2019,false,39);
		Student s4=new Student("ravi",78,"B.E",2011,true,23);
		Student s5=new Student("divya",97,"B.COM",2012,false,21);
		ArrayList<Student>details=new ArrayList<>();
		details.add(s1);
		details.add(s2);
		details.add(s3);
		details.add(s4);
		details.add(s5);
	//	details.stream().map(x->x.getName().charAt(x.getName().length()-2)).forEach(y->System.out.println(y));
//		details.stream().map(x->2022-x.getAge()).forEach(y->System.out.println(y));
	//	List<Integer>s=details.stream().map(x->2022-x.getAge()).collect(Collectors.toList());
//		s.forEach(x->System.out.println(x));
	//	details.stream().map(x->(x.getName().toUpperCase().substring(1,x.getName().length()-1))).forEach(y->System.out.println(y));
//	   details.stream().filter(x->x.getDegree().equals("B.E")).forEach(y->System.out.println(y.getName()));
//		details.stream().filter(x->x.getIsMale()==true&&x.getPassedOut()>2015).forEach(y->System.out.println(y.getName()));
//		List<Integer>l=details.stream().filter(x->x.getPassedOut()>2015).map(y->y.getID()).collect(Collectors.toList());
////		l.forEach(x->System.out.println(x));
//		List<Student>j=details.stream().filter(x->x.getIsMale()==false).collect(Collectors.toList());
//		for(Student s:j) {
//			System.out.println(s.getName()+" "+s.getAge()+" "+s.getDegree());
//		}
//		details.stream().filter(x->x.getIsMale()==false).forEach(y->System.out.println(y.getAge()+""+y.getDegree() ));
////	    
//		int max=0;
//		String k="";
//	   List<Student>d=details.stream().filter(x->x.getDegree().equals("B.E")&&x.getIsMale()==true).collect(Collectors.toList());
//	   for(Student s:d) {
//		   if(s.getAge()>max) {
//			   max=s.getAge();
//			   k=s.getName();
//			 }
//	   }
//	   System.out.println(k);
		long x=details.stream().count();
		System.out.println(x);
		
		long x1=details.stream().filter(k->k.getDegree().equals("B.E")).count();
		System.out.println(x1);

	}

}
