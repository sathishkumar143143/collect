package conditionusingforloop;

public class startswith {
	public static void main(String[]args) {
		String[]a= {"ram","HELLO","meena"};
		for(int i=0;i<a.length;i++) {
			String b=a[i];
			if(b.startsWith("m")) {
			
				System.out.println(b);
			}
		}
	}
}
