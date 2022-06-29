package collection2;

public class AdharCard {
	private String Name;
	private int age;
	private long AdharNo;
	private String gender;
	private String FathersName;
	
	
	   public void setName(String Name) {
		   this.Name=Name;
	   }  
	   public String getName() {
		   return Name;  
	   }
	   
	   
	   public void setGender(String gender) {
		   this.gender=gender;
	   }  
	   public String getGender() {
		   return gender;  
	   }
	   
	   
	   public void setFathersName(String FathersName) {
		   this.FathersName=FathersName;
	   }  
	   public String getFathersName() {
		   return FathersName;  
	   }
	   
	   
	   public void setAge(int age) {
		  this.age=age; 
	   }
	   public int getAge() {
		   return age;
	   }
	   
	   
	   public void setAdharNo(long AdharNo) {
		   this.AdharNo=AdharNo;
	   }
	   public long getAdharNo() {
		   return AdharNo;  
	   }
	   
	
	public AdharCard(String Name,int age,long AdharNo,String gender,String FathersName) {
		this.Name=Name;
		this.FathersName=FathersName;
		this.AdharNo=AdharNo;
		this.age=age;
		this.gender=gender;
	}
	public String toString() {
		return Name+" "+FathersName+" "+AdharNo+" "+age+" "+gender;
	}
                       
}
