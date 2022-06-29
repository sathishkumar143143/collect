package exception;

public class class1 {
	public static void main(String[]args) {
	    String a="hi";
	    String b="10";
	    int z=0;
	    int y=0;
	    int x=0;
	    try {
	    	z=a.length();
	    	x=Integer.parseInt(b);
	    	y=Integer.parseInt(a);
		
	    }catch(NullPointerException j) {
			System.out.println(j);
			System.out.println("null value cannot be used ");
	    }catch(NumberFormatException f) {
			System.out.println("String cannot be changed to number");
	    	
	    }catch(Exception k) {
			System.out.println(k);
	    }
		System.out.println("hi");
	    int []l= {x,y};
	    try {
			System.out.println(l[0]);
			System.out.println(l[3]);
	    }catch(IndexOutOfBoundsException o) {
			System.out.println("invalid index value");
	    	
	    }finally {
			System.out.println("HELLO");
			
		}
		System.out.println(z);
		System.out.println("HELLOW WORLD");
		
	
	
	}
}
