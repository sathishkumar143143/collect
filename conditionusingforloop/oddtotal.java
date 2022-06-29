package conditionusingforloop;

public class oddtotal {
	public static void main(String[]args) {
		int a=10;
		int oddtotal=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
				oddtotal=oddtotal+i;
			}
		}	
				System.out.println("Total="+oddtotal);
			
	}

}
