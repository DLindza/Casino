package lindsay.devon.casinoTest;

import lindsay.devon.casino.Deck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/2/16.
 */
public class DeckTest {

    @Test
    public void createNewDeckTest() {
        Deck deck = new Deck();
        int expected = 52;
        int actual = deck.deckList.size();
        Assert.assertEquals("A deck should have 52 cards", expected,actual);
    }


}
