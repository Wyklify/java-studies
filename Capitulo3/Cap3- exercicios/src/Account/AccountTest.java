import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount:");
        double depositAmount = input.nextDouble();
        System.out.printf("%n Adding $%.2f to %s account balance %n%n", depositAmount, account1.getName());
        account1.deposit(depositAmount);
         
        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.printf("Enter depoist amount for account2: ");
        depositAmount = input.nextDouble();

        System.out.printf("%n Adding $%.2f to %s account balance %n%n", depositAmount, account2.getName());
        account2.deposit(depositAmount);

        Account.displayAccount(account1);
        Account.displayAccount(account2);

        System.out.println("Enter withdral amount: ");
        depositAmount = input.nextDouble();
        System.out.printf("%n Removing %.2f of balance %.2f %n", depositAmount, account1.getBalance());
        account1.withdrawl(depositAmount);

         Account.displayAccount(account1);






    }    

}
