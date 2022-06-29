package conditionusingforloop;

public class evenaverage {
	public static void main(String[]args) {
		int a=10;
		int total=0;
		int count=0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				total=total+i;
				count=count+1;
				
			}
			
		}
		System.out.println(total/count);
		
	}

}
