package huge_interger;

import java.util.Arrays;

public class HugeInteger {

    private int[] inteirao = new int[41];

    public HugeInteger(long valor) {

        parse(String.valueOf(valor));
    }

    public HugeInteger() {
    }

    public void parse(String valor) {

        for (int i = valor.length() - 1; i >= 0; i--) {

            inteirao[inteirao.length - (valor.length() - i)] = valor.charAt(i) - '0';

        }
    }

    public boolean isEqualTo(HugeInteger numero) {

        return Arrays.equals(inteirao, numero.inteirao);

    }

    public boolean isNotEqualTo(HugeInteger numero) {

        return !isEqualTo(numero);

    }


    public static void main(String[] args) {

        HugeInteger numero = new HugeInteger(5985878484848587458L);
        HugeInteger numero2 = new HugeInteger(5985878484848587458L);

         numero.parse("65985878484848587458059858784848485874580");
         numero2.parse("65985878484848587458059858784848485874580");

        for (int i : numero.inteirao) {

            System.out.print(i);
        }

        System.out.println();
        
        System.out.println(numero.isEqualTo(numero2));

    }

}
