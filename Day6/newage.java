package Day6;

public class newage {
	public static void main(String[]args) {
		int a=28;
		int b=38;
		int c=48;
		if(a>b&&a>c) {
			System.out.println(a+"is greater age");
		}
		else if(b>a&&b>c) {
			System.out.println(b+"is greater age");
		}
		else if(c>b&&c>a) {
			System.out.println(c+"is greater age");
		}
		else {
			System.out.println("null");
		}
	}
}
