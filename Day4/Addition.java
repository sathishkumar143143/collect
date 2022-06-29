package Day4;

public class Addition {
	public static void main (String[]args) {
		String[]a =args[0].split(",");
		String[]b =args[1].split(",");
		int c =Integer.parseInt(a[0]);
		int d =Integer.parseInt(a[1]);
		int e =Integer.parseInt(b[0]);
		int f =Integer.parseInt(b[1]);
		int g =Integer.parseInt(b[2]);
		int h=d+f;
		int i=c+e;
		int j=(h+i)-g;
		System.out.println(j);
	}

}
