package conjunto_inteiros;

import java.util.Arrays;

public class IntegerSet {

    private boolean[] a = new boolean[101];


    public IntegerSet(int...valor){
        
        for (int i : valor) {
            
            this.a[i] = true;
        }
    }

    public IntegerSet() {

        Arrays.fill(a, false);

    }

    public void insertElement(int k) {

        if (k >= 0 && k <= 100) {

            a[k] = true;
        }
    }

    public void deleteElement(int m) {

        if (m >= 0 && m <= 100) {

            a[m] = false;
        }
    }

    public boolean isEqualTo(IntegerSet other) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] != other.a[i]) {

                return false;

            }

        }

        return true;
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        
       IntegerSet novoSet = new IntegerSet();

        for (int i = 0; i < set1.a.length; i++) {
            
            if (set1.a[i] || set2.a[i]) {
                
                novoSet.a[i] = true;
            } 
        }

        return novoSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2){

        IntegerSet novoSet = new IntegerSet();

        for (int i = 0; i < set1.a.length; i++) {
            
            if (set1.a[i] == false || set2.a[i] == false) {
                
                novoSet.a[i] = false;
            } else {

                novoSet.a[i] = true;
            }
        }

        return novoSet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!isVazio()) {

            for (int i = 0; i < a.length; i++) {

                if (a[i] == true) {

                    sb.append(String.format("%s ", i));
                }

            }

            return sb.toString();

        }

        return "---";
    }

    private boolean isVazio() {

        for (boolean b : a) {

            if (b == true) {

                return false;
            }
        }

        return true;

    }

}
