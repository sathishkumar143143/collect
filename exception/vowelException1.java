package exception;

public class vowelException1 {
	public static void main(String[]args) throws VowelException {
	String var="gym";
	   try {
		if(var.contains("a")||var.contains("e")||var.contains("i")||var.contains("0")||var.contains("u")) {
			System.out.println("Vowels Available");
		}
		else {
		  throw new VowelException("Vowels Not Available ");
		}
	   }catch(VowelException a) {
		   System.out.println(a.getMessage());
	   }
	}
}
