
public class Account {

    private String name;
    private double balance;

    public Account (String name, double balance){
        this.name = name;

        if (balance > 0.0)  this.balance = balance;
    }

    public void deposit (double depositAmount) {

        if (depositAmount > 0.0) {
            this.balance += depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    static void displayAccount (Account account){
        
        System.out.printf("%s balance: $%.2f %n", account.getName(), account.getBalance());
        
    }

    void  withdrawl(double balanceWithdrawl) {

        if ( this.balance >= balanceWithdrawl) {

            this.balance -= balanceWithdrawl;
        } else {

            System.out.println("Withdrawal amount exceeded account balance, account balance equals R$: " + balance);
        }
    }
    
}
