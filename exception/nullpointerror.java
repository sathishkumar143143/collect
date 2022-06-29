package exception;

public class nullpointerror {
	public static void main(String[]args) {
		String val="hi";
		try {
		
			int convert=Integer.parseInt(val);
		}catch(NumberFormatException a) {
			System.out.println(a);
			System.out.println("Pass only number inside String");
			
			
		}
		System.out.println(val);
		
		
	} 
	

}
