class Account {
    String accountNumber;
    double balance;

    Account(String accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("12345", 1000.50);
        Account acc2 = new Account("67890", 2500.75);
        acc1.display();
        acc2.display();
    }
}

