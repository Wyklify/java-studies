package triplos_pitagoras;

public class TriplosPitagoras {

    public static void main(String[] args) {

        int side1 = 0;
        int side2 = 0;
        int hypotenuse = 0;

        for (int i = 1; i <= 500; i++) {

            for (int j = 1; j <= 500; j++) {

                for (int k = 1; k <= 500; k++) {

                    side1 = (int) Math.pow(i, 2);
                    side2 = (int) Math.pow(j, 2);

                    hypotenuse = (int) Math.pow(k, 2);

                    if (side1 + side2 == hypotenuse) {

                        System.out.println(i + "\t" + j + "\t" + k);

                    }

                }

            }
        }

    }

}
