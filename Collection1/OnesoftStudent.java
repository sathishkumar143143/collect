package Collection1;

public class OnesoftStudent {
	private int id;
	private String name;
	private int age;
	private String degree;
	private String coursestudying;
	private int coursefee;
	public void setId(int id) {
	this.id=id;
	}
	public int getId() {
	 return id;	
	}
	public void setName(String name) {
		this.name=name;
		}
		public String getName() {
		 return name;	
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
		public void setDegree(String degree) {
			this.degree=degree;
			
		}
		public String getDegree() {
	       return degree;		
		}
		public void getCoursestudying(String coursestudying) {
			this.coursestudying=coursestudying;
		}
		public String setCoursestudying() {
			 return coursestudying;
		}
		public void setCoursefee(int coursefee) {
		this.coursefee=coursefee;
			
		}
		public int getCoursefee() {
	     return coursefee;		
		}
		public OnesoftStudent(int id,String name,int age,String degree,String coursestudying,int coursefee) {
			this.id=id;
			this.name=name;
			this.coursefee=coursefee;
			this.coursestudying=coursestudying;
			this.degree=degree;
			this.age=age;

		}
//
//public String toString() {
//	
//	return id+", "+name+","+coursefee+","+coursestudying+", "+degree+", "+age;
//}
}
