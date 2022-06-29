package conditionusingforloop;

public class max {
	public static void main(String[]args) {
		int[] a= {10,20,30,490,64,2628};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}

}


