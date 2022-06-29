package collection2;

public class Bike {
	public static void main(String[]args) {
		int a=10;
		int b=a+10;
		System.out.println(b);
		
		int c=b+10;
		System.out.println(c);
        try {
		int d=a/0;
		System.out.println(d);
        }catch(ArithmeticException e) {
        	System.out.println(e);
        	System.out.println("pleace dont divide using zero ");
        }
		int e=a+b+c;
		System.out.println(e);
	}

}
