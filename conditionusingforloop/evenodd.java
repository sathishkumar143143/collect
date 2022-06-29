package conditionusingforloop;

public class evenodd {
	public static void main(String[]args) {
		int a=10;
		int eventotal=0;
		int oddtotal=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				eventotal=eventotal+i;
			}
		
				else {
					oddtotal=oddtotal+i;
				}
				}
		System.out.println(eventotal);
		System.out.println(oddtotal);		
			}	
	
	}


