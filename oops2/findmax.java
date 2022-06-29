package oops2;

public class findmax {
	public String findmax1(int a,int b) {
		if(a>b) {
			return a+" is larger";
		}
		else {
			return b+" is larger";
		}
	}
	public String findmax2(int a,int b,int c) {
		if(a>b&&a>c) {
			return a+" is larger";
		}
		else if(b>c&&b>a){
			return b+" is larger";
		}
		else {
			return c+" is larger";
		}
	}
	public String findmax3(String a,String b) {
		if(a.length()>b.length()) {
			return a+" is larger";
		}
		else {
			return b+" is larger";
		}
	}
	public String findmax4(String a,String b,String c) {
		if(a.length()>b.length()&&a.length()>c.length()) {
			return a+" is larger";
		}
		else if(b.length()>a.length()&&b.length()>c.length()) {
			return b+" is larger";
		}
		else {
			return c+" is larger";
		}
	}



public static void main(String[]args) {
	findmax s1=new findmax();
	System.out.println(s1.findmax4("hello", "null","SATHISH KUMAR"));
}
}