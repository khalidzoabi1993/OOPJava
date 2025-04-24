
public class Account {
	
	private String ownerName;
	private String cardNumber;
	private double balance;
	
	public Account(String ownerName, String cardNumber, double balance)
	{
		setOwnerName(ownerName);
		setCardNumber(cardNumber);
		setBalance(balance);
		
	}
	public Account(String ownerName, String cardNumber)
	{
		setOwnerName(ownerName);
		setCardNumber(cardNumber);
		setBalance(0);
	}
	public String getOwnerName()
	{
		return ownerName;
	}
	public String getcardNumber()
	{
		return this.cardNumber;
	}
	public double getBalance()
	{
		return this.balance;
	}
	public void setOwnerName(String newOwnerName)
	{
		this.ownerName=newOwnerName;
	}
	public void setCardNumber(String newCardNumber)
	{
		this.cardNumber = newCardNumber;
	}
	public void setBalance(double newBalance)
	{
		this.balance=newBalance;
	}
	public void deposit(double moneyLoad)
	{
		if(moneyLoad > 0)
		{
			this.setBalance(this.balance + moneyLoad);
		}
		else
		{
			System.out.print("The money is less tan 0, Please Enter positive number\n");
		}
	}
	public void withDrawl(double moneyCharge)
	{
		if(moneyCharge <= 0)
		{
			System.out.print("Please Enter positive number\n");
		}
		else
		{
			setBalance(balance - moneyCharge);
		}
	}
	public void printAccount()
	{
		System.out.print("The Owner name is " + this.getOwnerName() + " The card number is " + this.getcardNumber() + " The balance is " + this.getBalance() + "\n");
	}
	

}
