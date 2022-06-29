package switchcase;

public class regex {
	public static void main(String[]args) {
		int a=1234;
	    int b=0;
	    int c=1;
	    for(int i=0;i<=a;i++) {
	    	b=a%10;
	    	c=b+c;
	    	a=a/10;
	    }
		System.out.println(c);
		
	}

}
