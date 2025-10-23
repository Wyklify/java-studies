import java.time.LocalDate;
import java.util.Scanner;

public class HealthProfileTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's u name?");
        String name = input.next();
        input.nextLine();
        System.out.println("What's u surname?");
        String surname = input.next();
        input.nextLine();
        System.out.println("What's u sex?");
        String sex = input.next();
        input.nextLine();
        System.out.println("What's u Birth Age ? - format: yyyy-mm-dd");

        String dateString = input.nextLine();

        LocalDate dateBirth = LocalDate.parse(dateString);

        System.out.println("What's u Height?: ");
        double height = input.nextDouble();

        System.out.println("What's u weight? ");
        double weight = input.nextDouble();

        HealthProfile person = new HealthProfile(name, surname, sex, dateBirth, height, weight);

        person.Info();

    }

}
