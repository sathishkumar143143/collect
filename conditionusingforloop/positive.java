package conditionusingforloop;

public class positive {
	public static void main(String[]args) {
		int[] a= {-10,20,-30,490,-64,2628};
		int positivecount=0;
		int negativecount=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				positivecount=positivecount+1;
				System.out.println(a[i]+" is positive");
			}
			else {
				negativecount=negativecount+1;
				System.out.println(a[i]+" is negative");
			}
			
			
		}
		System.out.println("positivecount = "+positivecount);
		System.out.println("negativecount = "+negativecount);
	}
}
