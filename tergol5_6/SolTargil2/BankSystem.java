import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Bank> banks;

    public BankSystem() {
        this.banks = new ArrayList<>();
    }

    public void addBank(Bank bank) {
        // Check if the bank already exists
        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getBankName().equals(bank.getBankName())) {
                System.out.println("Bank already exists: " + bank.getBankName());
                return;
            }
        }
        banks.add(bank);
    }
    public Bank getBankWithMaxBalance() {
        if (banks.isEmpty()) {
            return null;
        }
        Bank highestBank = banks.get(0);

        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getSumAllAccounts() > highestBank.getSumAllAccounts()) {
                highestBank = banks.get(i);
            }
        }
        return highestBank;
    }
}
