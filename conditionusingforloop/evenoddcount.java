package conditionusingforloop;

public class evenoddcount {
	public static void main(String[]args) {
		int a=10;
		int oddcount=0;
		int evencount=0;
		for(int i=0;i<=a;i++) {
		  if(i%2==0) {
			  
			 evencount=evencount+1; 
		  }
		  else {
			  oddcount=oddcount+1;
		  }
		}
		  System.out.println(evencount);
		  System.out.println(oddcount);
	}
}
