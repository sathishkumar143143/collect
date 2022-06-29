package exception;

public class indexoutofbound1 {
	public static void main(String[]args) {
		int []a= {1,2,3,4,5};
		int b=0;
		try {
		b=a[5];
		
		System.out.println(b);
		}catch(ArrayIndexOutOfBoundsException c) {
			System.out.println(c);
			System.out.println("array index exit the limit");
			
			
		}
		System.out.println(a[3]);
		
		
	} 
	

}
