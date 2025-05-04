public class MainSol1 {
    public static void main(String[] args) {
        BankSystem bankSystem = new BankSystem();

        Bank bank1 = new Bank("Bank1");
        Bank bank2 = new Bank("Bank2");
        
        CustomerAccount account1 = new CustomerAccount("Alice", 6000);
        CustomerAccount account2 = new CustomerAccount("Bob", 2000);
        bank1.addAccount(account1);
        bank2.addAccount(account2);
       
        bankSystem.addBank(bank1);
        bankSystem.addBank(bank2);
       

        Bank bankWithHighestTotalBalance = bankSystem.getBankWithMaxBalance();


        if (bankWithHighestTotalBalance != null) {
            System.out.println("Bank with highest total balance: " + bankWithHighestTotalBalance.getBankName());
        } else {
            System.out.println("No banks found in the bank system.");
        }

//        System.out.println(bankWithHighestTotalBalance != null ?
//                "Bank with highest total balance: " + bankWithHighestTotalBalance.getBankName() : "No banks found in the bank system.");
    }
}
