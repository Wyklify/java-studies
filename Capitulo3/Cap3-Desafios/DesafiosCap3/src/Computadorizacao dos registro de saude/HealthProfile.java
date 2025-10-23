import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {

    private String name;
    private String surname;
    private String sex;
    private LocalDate dateofBirth;
    private double height;
    private double weight;

    public HealthProfile(String name, String surname, String sex, LocalDate dateofBirth, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.dateofBirth = dateofBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDateofBirth(LocalDate dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    double age(LocalDate birthDate) {

        LocalDate today = LocalDate.now();

        LocalDate birth = birthDate;

        Period p = Period.between(birth, today).normalized();

        double age = p.getYears() + p.getMonths() / 12.0 + p.getDays() / 365.0;

        return age;
    }

    double heartRateMax() {

        return 220 - age(dateofBirth);

    }

    String heartRateTargetRange() {

        double heartRateMinTarget = heartRateMax() * 0.50;
        double heartRateMaxTarget = heartRateMax() * 0.85;

        return String.format("%.2f at %.2f", heartRateMinTarget, heartRateMaxTarget);
    }

    double bmi () {

        return weight/(height * height);
        
    }

    String graphBmi( double bmi) {

        if (bmi < 18.5)  return String.format("Abaixo do peso");
        if (bmi >= 18.5 && bmi<=24.9 ) return String.format("Peso normal");
        if (bmi >= 25 && bmi <= 29.9) return String.format("Sobrepeso");
        if (bmi >= 30) return String.format(" Obesidade");

        return null;
    }

    void showText( String text) {

        int range = 50;

        String [] a = new String [range];

        for (int i=0; i < range; i++) {

            a[i] = "=";

        }

        int pos = (range - text.length() )/ 2;

        for (int i=0; i < text.length() && pos + i < range; i++) {

            a[pos + i] = String.valueOf(text.charAt(i));
        }

        for (String string : a) {
            
            System.out.print(string);
        }

        System.out.println();
    } 

    void Info(){

        showText("PERSONAL DATA");

        System.out.printf("Name: %s %s %n", this.name, this.surname );
        System.out.printf("Birth age: %s %n", this.dateofBirth );
        System.out.printf("Age: %.2f %n", age(dateofBirth) );
        System.out.printf("Height: %.2fm %n", this.height );
        System.out.printf("Weight: %.2fKg %n", this.weight );

        showText("HEART FREQUENCE");

        System.out.printf("Max heart Freq: %.2f bps%n", heartRateMax() );
        System.out.printf("Heart Freq. Target: %s %n", heartRateTargetRange() );

        showText("BMI");

        System.out.printf("Your BMI is %.2f so u are %s %n", bmi(), graphBmi(bmi()));
        



        
        
        


    }

}
