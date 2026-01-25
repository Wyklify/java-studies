package conjunto_inteiros;

public class Questao813 {

    public static void main(String[] args) {

        IntegerSet um = new IntegerSet(42,90,100);
        um.insertElement(20);

        IntegerSet dois = new IntegerSet(65,33,42);
        dois.insertElement(30);
        dois.insertElement(20);

        System.out.println(IntegerSet.union(um, dois));
        System.out.println(IntegerSet.intersection(um, dois));

    }

}
