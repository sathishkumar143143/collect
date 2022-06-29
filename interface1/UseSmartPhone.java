package interface1;

public class UseSmartPhone {
	public static void main(String[]args) {
		SmartPhone s1=new SmartPhone();
		s1.message("use to send message");
		s1.portable();
        s1.Talk("is used to talk"); 		
		System.out.println(s1.radio());
	}

}
