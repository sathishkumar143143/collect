package exception;

public class Ageexception1 {
	public static void main(String[]args) throws AgeException {
		int a=17;
		try {
		if(a>=18) {
			System.out.println("ELIGIBLE TO VOTE");
		}
		else {
		  throw new AgeException("NOT ELIGIBLE FOR VOTE");
		}
		}catch(AgeException h) {
			System.out.println(h.getMessage());
		}
		System.out.println("HELLOWORLD");
}
}