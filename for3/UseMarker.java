package for3;



public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.brand="REYNOLDS";
		m1.color="BLUE";
		m1.price= 25;
		Marker m2=new Marker();
		m2.brand="PENTON";
		m2.color="WHITE";
		m2.price= 25;
		Marker m3=new Marker();
		m3.brand="PARKER";
		m3.color="REB";
		m3.price= 50;
        Marker[] m= {m1,m2,m3};
        for(int i=0;i<m.length;i++) {
        
         
        System.out.println(m[i].brand+" "+m[i].color+" "+m[i].price);
        }
	}

}
