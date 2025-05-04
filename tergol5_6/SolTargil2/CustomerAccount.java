
public class CustomerAccount {
	
	private String customerName;
	
	private double balance;
	
	public CustomerAccount(String customerName, double balance)
	{
		this.customerName = customerName;
		this.balance = balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public String getCustomerName()
	{
		return this.customerName;
	}

}
