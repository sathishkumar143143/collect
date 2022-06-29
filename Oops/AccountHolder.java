package Oops;

public class AccountHolder {
	private int accountNumber;
	private String accountHolderName1;
	private float accountBalance1;
	public void setAccountNumber(int accountnum) {
		accountNumber=accountnum;
	}
	public int getAccountNumber() {
	 return accountNumber;	
	}
	public void setAccountHolderName(String accountholdername) {
		this.accountHolderName1=accountholdername;
	}
	public String getAccountHolderName() {
	 return accountHolderName1;	
	}
	public void setAccountBalance(float accountbalance) {
		accountBalance1=accountbalance;
	}
	public float getAccountBalance() {
	 return accountBalance1;
	}
}
