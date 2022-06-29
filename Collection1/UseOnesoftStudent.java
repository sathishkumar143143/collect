package Collection1;

import java.util.ArrayList;

public class UseOnesoftStudent {
	public static void main(String[]args) {
		OnesoftStudent s1=new OnesoftStudent(1,"MANI",24,"B.E","JAVA",60000);
		OnesoftStudent s2=new OnesoftStudent(2,"RAVI",26,"B.SC","JAVA",80000);
		OnesoftStudent s3=new OnesoftStudent(3,"MURALI",27,"B.Com","JAVA",40000);
		OnesoftStudent s4=new OnesoftStudent(4,"MARAN",29,"B.E","JAVA",30000);
		ArrayList<OnesoftStudent>stuDetail=new ArrayList<>();
		stuDetail.add(s1);
		stuDetail.add(s2);
		stuDetail.add(s3);
		stuDetail.add(s4);
//		for(int i=0;i<stuDetail.size();i++) {	
//    	System.out.println( stuDetail.get(i).getName()+" "+ stuDetail.get(i).getId()+" "+ stuDetail.get(i).getAge()+" "+ stuDetail.get(i).getDegree()+" "+ stuDetail.get(i).getCoursefee()+" "+ stuDetail.get(i).getCoursefee());
//    	
//    	
//		}
//		System.out.println("   ");
//		for(OnesoftStudent a:stuDetail) {
//			System.out.println( a.getName()+" "+ a.getId()+" "+ a.getAge()+" "+a.getDegree()+" "+ a.getCoursefee()+" "+ a.getCoursefee());
//		}
//		System.out.println("   ");
//		stuDetail.forEach(z->System.out.println( z.getName()+" "+ z.getId()+" "+ z.getAge()+" "+z.getDegree()+" "+ z.getCoursefee()+" "+ z.getCoursefee()));
   
//		int max=0;
//	for(OnesoftStudent a:stuDetail) {
//		if(a.getAge()>max) {
//			max=a.getAge();
//		}}
//			System.out.println(max);
//	
	ArrayList<String> name=new ArrayList<>();
	for(OnesoftStudent s:stuDetail) {
	if(s.getDegree().equals("B.E")) {
		name.add(s.getName());
	}}
		System.out.println(name);
	
	}

}
