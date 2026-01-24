package saving_account;

public class Questao86 {

    public static void main(String[] args) {

        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount account1 = new SavingsAccount(2000);
        SavingsAccount account2 = new SavingsAccount(3000);

        for (int i = 1; i <= 12; i++) {
            
            System.out.println(account1.calculateMonthlyInterest());
            System.out.println(account2.calculateMonthlyInterest());

            System.out.println();

        }

    }

}
