package oops2;

public class Abacus {
	public int add(int num1,int num2) {
	  return num1+num2;
		
	}
	public int sub(int num1,int num2) {
		  return num1-num2;
			
		}
	public int multiply(int num1,int num2) {
		  return num1*num2;
			
		}

}
class calculator extends Abacus{
	public float divide(int num1,int num2) {
		return num1/num2;
	}
	
}
