package Oops;

public class UseCar {
	public static void main(String[]args) {
		Engine s1=new Engine();
		s1.setEngineno(2344555);
		s1.setEnginecc(1400);
		
		Car w1=new Car();
		w1.setBrand("ROLLS ROYS");
		w1.setColor("BLUE");
	    w1.setPrice(20000000);
	    w1.setEngine(s1);
	    
	    System.out.println(w1.getEngine().getEnginecc()+"  "+w1.getEngine().getEngineno());
	}

}
