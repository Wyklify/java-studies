package saving_account;

public class SavingsAccount {

    public static double annualInterestRate; // taxa de juros anual
    private double savingsBalance;// valor em deposito

    

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){

        return savingsBalance += annualInterestRate * this.savingsBalance / 12;

    }

    public static double modifyInterestRate(double valor){

        return annualInterestRate = valor;
    }
    
}
