package Oops;

public class Car {
	private String brand1;
	private int price1;
	private String color1;
	private Engine engine1;
	
	public void setBrand(String brand) {
		brand1=brand;
	}
	public String getBrand() {
		return brand1;
	}
	
	public void setColor(String color) {
		color1=color;
	}
	public String getColor() {
		return color1;
	}
	
	public void setPrice(int price) {
		price1=price;
	}
	public int getPrice() {
		return price1;
	}
	public void setEngine(Engine engine) {
		engine1=engine;
	}
	public Engine getEngine() {
		return engine1;
	}

}




class Engine{
	private int engineno1;
	private int enginecc1;
	
	public void setEngineno(int engineno) {
		engineno1=engineno;
	}
	public int getEngineno() {
		return engineno1;
	}
	
	public void setEnginecc(int enginecc) {
		enginecc1=enginecc;
	}
	public int getEnginecc() {
		return enginecc1;
	}
	
	
}
