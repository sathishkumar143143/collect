package interface1;

public class creditcard implements bank{

	
	public int getInterest(int num) {
       int interest=(num*18)/100;
		return interest;
	}

}
