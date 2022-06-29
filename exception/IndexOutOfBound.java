package exception;

public class IndexOutOfBound {
	public static void main(String[]args) {
		String val="praveen";

		try {
		
			System.out.println(val.charAt(7));
		}catch(StringIndexOutOfBoundsException a) {
			System.out.println(a);
			System.out.println(" number exit the limit of index");
			
			
		}
		System.out.println(val);
		
		
	} 
	

}
