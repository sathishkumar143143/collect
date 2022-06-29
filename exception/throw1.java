package exception;

public class throw1 {
	public static void main(String[]args) {
		int a=17;
		try {
		if(a>=18) {
			System.out.println("ELIGIBLE TO VOTE");
		}
		else {
		  throw new ArithmeticException("NOT ELIGIBLE FOR VOTE");
		}
		}catch(ArithmeticException f) {
		System.out.println(f.getMessage());
		}
		System.out.println("HELLO WORLD");
	}

}
