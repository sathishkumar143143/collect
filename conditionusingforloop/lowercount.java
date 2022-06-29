package conditionusingforloop;

public class lowercount {
	public static void main(String[]args) {
		String a="SaThIsHkUmar";
	    String b=a.toLowerCase();
	    int lowercount=0;
	    for(int i=0;i<a.length();i++) {
	    	if(a.charAt(i)==b.charAt(i)) {
	    	lowercount++;	
	    	}}
		System.out.println(lowercount);
	    	
	    }

}
