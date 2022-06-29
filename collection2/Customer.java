package collection2;

public class Customer {
	private String name;
	private String PanNum;
	private int AccountNumber;
	private int age;
	private String gender;
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
		
	}
	
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber=AccountNumber;
	}
	public int getAccountNumber() {
		return AccountNumber;
		
	}
	public void setPanNum(String PanNum) {
		this.PanNum=PanNum;
	}
	public String getPanNum() {
		return PanNum;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
		
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;

	}
	public Customer(String name,String PanNum, int AccountNumber, int age, String gender) {
		this.name=name;
		this.AccountNumber=AccountNumber;
		this.gender=gender;
		this.age=age;
		this.PanNum=PanNum;
	}
   public String toString() {
	return name+" "+gender+" "+age+" "+AccountNumber+" "+PanNum;
	   
   }
}
