package conditionusingforloop;

public class count {
	public static void main(String[]args) {
		String a ="SofTVe26K5O786e";
         char[]b=a.toCharArray();
		int lowercount=0;
		int uppercount=0;
		int numbercount=0;
		for(int i=0;i<a.length();i++) {
			if(b[i]>='A'&&b[i]<='Z') {
				uppercount++;
			}
			else if(b[i]>='a'&&b[i]<='z') {
			      lowercount++;
			}
			else if(b[i]>='0'&&b[i]<='9') {	
                   numbercount++;
			}	
		}
		System.out.println("UPPERCOUNT ="+uppercount);
		System.out.println("LOWERCOUNT ="+lowercount);
		System.out.println("NUMBERCOUNT ="+numbercount);
	
}
}


		
	


