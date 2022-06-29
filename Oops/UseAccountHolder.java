package Oops;

public class UseAccountHolder {
	public static void main(String[]args) {
		AccountHolder s1=new AccountHolder();
		s1.setAccountNumber(123456789);
		s1.setAccountHolderName("SATHISH");
		s1.setAccountBalance(23.50f);
		System.out.println("ACCOUNT NUMBER="+s1.getAccountNumber()+"  ACCOUNT HOLDER NAME="+s1.getAccountHolderName()+"  ACCOUNT BALANCE="+s1.getAccountBalance());
	}
	

}
