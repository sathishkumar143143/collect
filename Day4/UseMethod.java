 package Day4;
  
    public class UseMethod{
	  public static void main (String[]args) {
		Method1 S1=new Method1();
		String[] a=args[0].split(",");
		String[] b=args[1].split(",");
		S1.name=a[0];
		S1.price =Integer.parseInt(a[1]);
		Method1 S2=new Method1();
		S2.name=b[0];
		S2.price= Integer.parseInt(b[1]);
		String e=S1.name.concat(S2.name);
		String f=e.toUpperCase();
		System.out.println(f);
		System.out.println(S1.price+S2.price);
		
		
	}
}
 



class Method1 {
	 String name;
	 int price;
	 
	 

}
