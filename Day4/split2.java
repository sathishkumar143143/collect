package Day4;

public class split2 {
	public static void main(String[]args) {
		String b=args[1];
		String c=args[2];
		String[] d=args[0].split(",");
		int a1=Integer.parseInt(d[0]);
		int a2=Integer.parseInt(d[1]);
		int a3=Integer.parseInt(b);
		int a4=Integer.parseInt(c);
		int f=a1+a4;
		int g=a2*a3;
		int h=f+g;
		System.out.println(h);
		
		
	}

}
