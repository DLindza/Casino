package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class Card {
    int id;
    public enum Suit {HEARTS, CLUBS, SPADES, DIAMONDS}
    Suit suit;
    public int value;
    public String name;
    public enum Color {BLACK, RED}
    public Color color;

    public Card(int id, Suit suit) {
        this.id = id;
        this.suit = suit;
        this.value = setValue(id);
        this.name = setName(id);
        this.color = setColor(suit);
    }

    int setValue(int id) {
       for (int i = id; i <14; i++) {
            if (i == 1) {
                this.value = 11;
                break;
            } else if (i > 10) {
                this.value = 10;
                break;
            } else {
                this.value = i;
            }
        }
        return this.value;
    }

    String setName(int id) {
        for (int i = id; i < 14; i++) {
            if (i == 1) {
                this.name = "Ace of " + this.suit;
                break;
            } else if(i == 11) {
                this.name = "Jack of "  + this.suit;
                break;
            } else if(i == 12) {
                this.name = "Queen of " + this.suit;
                break;
            } else if(i == 13) {
                this.name = "King of " + this.suit;
                break;
            } else { this.name = i + " " + this.suit;}
        }
        return this.name;
    }

    Color setColor(Suit suit){
        if (suit.equals(Suit.CLUBS) || suit.equals(Suit.SPADES)) {
            return this.color = Color.BLACK;
        }
        return this.color = Color.RED;
    }

}
