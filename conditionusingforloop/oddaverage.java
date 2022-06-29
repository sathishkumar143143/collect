package conditionusingforloop;

public class oddaverage {
	public static void main(String[]args) {
		int a=10;
		int total=0;
		int count=0;
		for(int i=0;i<=a;i++) {
			if(i%2!=0) {
				total=total+i;
				count++;
				
			}
			
		}
		System.out.println(total/count);
		
	}

}




