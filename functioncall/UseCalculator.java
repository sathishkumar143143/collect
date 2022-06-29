package functioncall;

public class UseCalculator {
	public static void main(String[]args) {
		Calculator c=new Calculator();
		c.add(20, 15);
	System.out.println(	c.divide(36,6));
		c.sub(20, 10);
		System.out.println(c.multiply(8, 10));
		System.out.println(c.findReminder(35, 10));
		System.out.println(c.findLength1("SATHISH"));
	}

}
