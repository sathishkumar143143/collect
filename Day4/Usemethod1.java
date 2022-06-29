package Day4;

public class Usemethod1 {
	public static void main(String[]args) {
		String[] a=args[0].split(",");
		String[] b=args[1].split(",");
		int c=Integer.parseInt(a[1]);
		int d=Integer.parseInt(b[1]);
		Method2 f1=new Method2();
		f1.name=a[0];
		f1.price=c;
		f1.colour=a[2];
		Method2 f2=new Method2();
		f2.name=b[0];
		f2.price=d;
		f2.colour=b[2];
		Boolean e=f1.price>f2.price;
		System.out.println(f1.name+"/"+f2.name);
		System.out.println(f1.colour+"/"+f2.colour);
		System.out.println("lowcost="+f2.price+" "+e);
		
	      
		
		
		
	}
	

}

class Method2{
	String name;
	int price;
	String colour;
}