package switchcase;

public class case3 {
	public static void main (String[]args) {
		int a=8;
		int b=5;
		String maths ="multi";
		switch (maths) {
		case "add":System.out.println(a+b);break;
		case "sub":System.out.println(a-b);break;
		case "multi":System.out.println(a*b);break;
		case "divide":System.out.println(a/b);break;
		case "mode":System.out.println(a%b);break;
		default : System.out.println("null");
		}
	}
}
