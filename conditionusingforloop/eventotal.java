package conditionusingforloop;

public class eventotal {
	public static void main(String[]args) {
		int a=10;
		int eventotal=0;
		
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				eventotal=eventotal+i;
			}
		}	
				System.out.println("Total="+eventotal);
			
		
	}

}
