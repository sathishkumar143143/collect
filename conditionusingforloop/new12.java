package conditionusingforloop;

public class new12 {
	public static void main(String[]args) {
		String[]a= {"Bistol","gotherbugOnesoft","fjord","malmo"};
		int max=0;
		String b="";
	   for(int i=0;i<a.length;i++) {
		   if(a[i].length()>max) {
			   max=a[i].length();
			   b=a[i];
		   }
	   }
		   System.out.println(b);
		   
		   
	   
	
	}

}
