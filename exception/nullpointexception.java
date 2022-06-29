package exception;

public class nullpointexception {
	public static void main(String[]args) {
		String a=null;
		try {
		int b=a.length();
		System.out.println(b);
		}catch(NullPointerException h) {
			System.out.println("Length Cannot Be Found Using Null Value");
		
		}
		System.out.println("HELLO");
	}

}
