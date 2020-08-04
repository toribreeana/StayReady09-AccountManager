import com.codedifferently.bankaccountlab.BankAccount;

public class CheckingAccount {

    //constructor
    public CheckingAccount(int expectedAccountNumber, double expectedFees, String expectedName, double expectedBalance) {
    }

        private int accountNumber;
        private double fees;
        private String name;
        private double balance;

        public CheckingAccount(int accountNumber, double fees, String name, double balance){
            this.accountNumber = accountNumber;
            this.fees = fees;
            this.name = name;
            this.balance = balance;
        }

        public CheckingAccount(int accountNumber, String name, double fees, double balance) {
            super();
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getFees() {
            return fees;
        }

        public void setFees(double fees) {
            this.fees = fees;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        //@Override
        public void deposit(double depositAmount) {

        }

        public double getBalance() {
            return balance;
        }

        //@Override
        public boolean withdraw(double withdrawAmount) {
            return false;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String toString(){
            return accountNumber +" "+ fees +" "+ name +" "+ balance;
        }
    }
}
