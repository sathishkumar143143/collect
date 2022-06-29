package conditionusingforloop;

public class vouvels1 {
	public static void main(String[]args) {
		String[]a= {"ram","HELLO","meena"};
		for(int i=0;i<a.length;i++) {
			String b=a[i].toUpperCase();
			if(b.contains("A")||b.contains("E")||b.contains("I")||b.contains("O")||b.contains("U")) {
			}
				System.out.println(a[i]);
			
		}
	}

}
