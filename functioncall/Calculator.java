package functioncall;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	   }
	public void sub(int num1,int num2) {
		System.out.println(num1-num2);
	   }
	public int divide(int num1,int num2) {
		return num1/num2;
	   }
	public int multiply(int num1,int num2) {
		return num1*num2;
	   }
	public int findReminder(int num1,int num2) {
		return num1%num2;
	}public int findLength1(String name) {
		int name1= name.length();
		return name1;
	}

}
