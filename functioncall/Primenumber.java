package functioncall;

 class Primenumber {
	public String prime(int num1) {
		int a=0;
		for(int i=2;i<num1;i++) {
			if(num1%i==0) {
		
			a++;
			}
	}
	if(a==0) {
		return num1+ "is prime";
		
	}
	else {
		return num1+"is not prime";
	}

	}
public static void main(String[]args) {
	Primenumber s1=new Primenumber();
	System.out.println(s1.prime(5));
	
}
}