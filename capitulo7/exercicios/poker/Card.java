package exercicios.poker;

public class Card {

    private final String face;
    private final String naipe;


    public Card(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return face + " of " + naipe;
    }
    
    
}
