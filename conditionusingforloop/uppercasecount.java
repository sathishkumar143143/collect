package conditionusingforloop;

public class uppercasecount {
	public static void main(String[]args) {
		String a="SaThIsHkUmAr";
	    String b=a.toUpperCase();
	    int uppercount=0;
	    for(int i=0;i<a.length();i++) {
	    	if(a.charAt(i)==b.charAt(i)) {
	    	uppercount++;	
	    	}}
		System.out.println(uppercount);
	    	
	    }
	    }

