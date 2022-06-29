package Day4;

public class split3 {
	public static void main(String[]args) {
		String a=args[0];
		String[] b=a.split(",");
		int c=Integer.parseInt(b[0]);
		int d=Integer.parseInt(b[1]);
		int e=Integer.parseInt(b[2]);
		int f=Integer.parseInt(b[3]);
		int g=Integer.parseInt(b[4]);
		int h=Integer.parseInt(b[5]);
		int i=(c+d+e+f+g+h)/6;
		System.out.println(i);
		
	}
}
