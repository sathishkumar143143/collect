package Day3;

public class Splitarray {
	public static void main (String[]args) {
		String a="world wide wonder";
		String[]b=a.split(" ");
		int c=b[0].length();
		int d=b[1].length();
		int e=b[2].length();
		String f=b[0].toUpperCase();
		String g=b[1].toUpperCase();
		String h=b[2].toUpperCase();
		String i="programs";
		String j=i.toUpperCase();
		String k=(a+" "+i);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(j);
		System.out.println(k);
	}

}
