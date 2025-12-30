package exercicios.poker;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card[] deck;
    private int indiceCarta;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randonNumbers = new SecureRandom();

    public DeckOfCards() {

        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
                "Queen", "King" };
        String[] nipe = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new Card[NUMBER_OF_CARDS];
        indiceCarta = 0;

        for (int i = 0; i < deck.length; i++) {

            deck[i] = new Card(faces[i % 13], nipe[i / 13]);
        }
    }

    public void shuffle() {

        indiceCarta = 0;

        for (int i = deck.length - 1; i > 0; i--) {

            int second = randonNumbers.nextInt(i + 1);

            // compara Card atual com uma selecionada aleatoriamente
            Card temp = deck[i];
            deck[i] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {

        if (indiceCarta < deck.length) {

            return deck[indiceCarta++];
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        DeckOfCards baralho = new DeckOfCards();
    }
}
