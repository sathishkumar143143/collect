package Day6;

public class age {
	public static void main(String[]args) {
		int a=39;
		if(a>0&&a<=5) {
			System.out.println("kids");
		}
		else if(a>5&&a<=10) {
			System.out.println("child");
		}
		else if(a>10&&a<=18) {
			System.out.println("children");
		}
		else if(a>18&&a<=30) {
			System.out.println("adults");
		}
		else{
			System.out.println("old");
		}
	}
	

}
