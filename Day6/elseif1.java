package Day6;

public class elseif1 {
	public static void main(String[]args) {
		int a=65;
		int b=94;
		if(a%2==0&&b%2==0) {
			System.out.println("both divided by 2");
		}
		else if(a%5==0&&b%5==0) {
			System.out.println("both divided by 5");
		}
		else if(a%2==0||b%2==0) {
			System.out.println("either one divided by 2");
		}
		else if(a%5==0||b%5==0) {
			System.out.println("either one divided by 5");
		}	
	
		else {System.out.println("not yet");
		}
	}
}

