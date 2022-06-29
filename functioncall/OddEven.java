package functioncall;

public class OddEven {
	public String oddeven (int num1) {

		if (num1 % 2 == 0) {
	    return  num1+" is even";
		}
		else {
		return num1+" is odd";
		}
	
	}
	public String larger(int num1,int num2) {
		if(num1>num2) {
			return num1+ "is larger";
			
		}
		else {
			return num2+"is larger";
		}
	}
	public String smaller (int num1,int num2,int num3) {
		if(num1<num2&&num1<num3) {
			return num1+"is smaller";
		}
		else if(num2<num1&&num2<num3) {
			return num2+"is smaller";	
		}
		else {
			return num3+"is smaller";
		}
	}

}
