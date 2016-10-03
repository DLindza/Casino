package lindsay.devon.casinoTest;

import lindsay.devon.casino.Game;
import lindsay.devon.casino.GoFish;
import lindsay.devon.casino.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/2/16.
 */
public class GoFishTest{

    @Test
    public void subDeckTest() {
        Player player = new Player(1,"Dev", "Linds", "pizza");
        GoFish goFish = new GoFish(player);
        goFish.subDeck();
        int expected = 20;
        int actual = GoFish.goFishDeck.size();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setGameStateTest() {
        Player player = new Player(1, "Name", "lastName", "pin");
        GoFish goFish = new GoFish(player);
        goFish.playerMatches = 3;
        goFish.houseMatches = 7;
        goFish.setGameState();
        String expected = "LOSS";
        String actual = goFish.state.toString();
        Assert.assertEquals("Game should have been lost",expected,actual);

    }

    @Test
    public void dealTest() {
        Player player = new Player(1, "Name", "lastName", "pin");
        GoFish goFish = new GoFish(player);
        goFish.deal();
        int expected = 7;
        int actual = goFish.playerHand.size();
        Assert.assertEquals("Player hand should be 6",expected,actual);
    }
}
