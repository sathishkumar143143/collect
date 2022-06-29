package Day4;

public class Useclass {
       public static void main(String[]args) {
    	   class1  S1=new class1();
    	    S1.name = args[0];
    	    S1.regno =Integer.parseInt(args[1]);
    	    S1.num =Long.parseLong(args[2]);
    	    S1.height=Float.parseFloat(args[3]);
    	    System.out.println(S1.name);
    	    System.out.println(S1.regno);
    	    System.out.println(S1.num);
    	    System.out.println(S1.height);
    	    
    	    
    	}
    	
    }
class class1 {
	 String name;
	 int regno;
	 long num;
	 float height;
	 

}

