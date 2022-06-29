package switchcase;

public class case5 {
	public static void main (String[]args) {
		String food= "pongal";
		switch (food) {
		case "idly":System.out.println("RATE=10");break;
		case "dosa":System.out.println("RATE=20");break;
		case "poori":System.out.println("RATE=30");break;
		case "chappathi":System.out.println("RATE=25");break;
		case "pongal":System.out.println("RATE=50");break;
		case "briyani":System.out.println("RATE=100");break;
		
		default:System.out.println("NONE");break;
		}
	}

}
