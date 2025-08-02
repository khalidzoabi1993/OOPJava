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
        // Check if the account already exists
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCustomerName().equals(account.getCustomerName())) {
                System.out.println("Account already exists for customer: " + account.getCustomerName());
                return;
            }
        }
        accounts.add(account);
    }
    public double getSumAllAccounts() {
        double totalBalance = 0;
        for (int i = 0; i < accounts.size(); i++) {
            totalBalance += accounts.get(i).getBalance();
        }
        return totalBalance;
    }

}
