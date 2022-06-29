package oops2;

public class overloading {
	public static void main(String[]args) {
		addition s1=new addition();
		s1.add(2, 3, 6);
		System.out.println(s1.add(3, 40));
		System.out.println(s1.add("hi ", "hello"));
	}
}	
	
	class addition{
	public int add(int a,int b) {
	return a+b;
		}
	public String add(String a,int b) {
		return a+b;
			}
	public String add(String a,String b) {
		return a+b;
			}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);;
			}

}
