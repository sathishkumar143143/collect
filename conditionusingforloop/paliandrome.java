package conditionusingforloop;

public class paliandrome {
	public static void main(String[]args) {
		String a= "MALAYALAM";
		String b="";
		for(int i=a.length()-1;i>=0;i++) {
			b=b+a.charAt(i);
		}
			if(a.equals(b)) {
				System.out.println("is palendrome");
			}
			else {
				System.out.println("is not palliendrome");
			}
	}
	}


