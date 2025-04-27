public class CardAccount {
    private String ownerName;
    private String cardNumber;
    private double balance;
    public CardAccount(String name, String number) {
        this.ownerName = name;
        this.cardNumber = number;
        this.balance = 0.0;
    }
    public CardAccount(String name, String number, double balance) {
        this.ownerName = name;
        this.cardNumber = number;
        this.balance = balance;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setOwnerName(String name) {
        this.ownerName = name;
    }
    public void setCardNumber(String number) {
        this.cardNumber = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if (amount > 0) {
            this.balance -= amount;
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void disply() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Balance: " + balance);
    }

}


