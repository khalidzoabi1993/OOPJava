import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<CustomerAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }
    public String getBankName()
    {
    	return this.bankName;
    }
    public void addAccount(CustomerAccount account) {
        accounts.add(account);
    }
    public double getBankTotalBalance() {
        double totalBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            CustomerAccount account = accounts.get(i);
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }
}
