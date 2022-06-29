package collectionStream;

public class Student {
	private String name;
	private int id;
	private String degree;
	private int passedout;
	private int age;
	private boolean isMale;
	
	public void setName(String name) {
	this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setID(int id) {
		this.id=id;	
		}
		public int getID() {
			return id;
		}
		public void setPassedOut(int passedout) {
			this.passedout=passedout;	
		
			}
			public int getPassedOut() {
				return passedout;
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
				public void setIsMale(boolean isMale) {
					this.isMale=isMale;	
					}
				public boolean getIsMale() {
						return isMale;
					}
		public Student(String name,int id,String degree,int passedout,boolean isMale,int age) {
		 this.name=name;
		 this.age=age;
		 this.degree=degree;
		 this.id=id;
		 this.isMale=isMale;
		 this.passedout=passedout;
		 
			
		} 
//	
//public String toString() {
//	return name+""+age+""+degree+""+id+""+isMale+""+passedout;
//
//	}
}

