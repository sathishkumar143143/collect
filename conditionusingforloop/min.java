package conditionusingforloop;

public class min {
	public static void main(String[]args) {
		int[] a= {10,20,30,490,64,2628};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println(min);
	}	

}
