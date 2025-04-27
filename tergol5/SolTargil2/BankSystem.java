import java.util.ArrayList;

public class BankSystem {
    private ArrayList<Bank> banks;

    public BankSystem() {
        this.banks = new ArrayList<>();
    }

    public void addBank(Bank bank) {
        banks.add(bank);
    }
    public Bank getBankWithHighestTotalBalance() {
        if (banks.isEmpty()) {
            return null;
        }
        Bank highestBank = banks.get(0);

        for (int i = 0; i < banks.size(); i++) {
            if (banks.get(i).getBankTotalBalance() > highestBank.getBankTotalBalance()) {
                highestBank = banks.get(i);
            }
        }
        return highestBank;
    }
}
