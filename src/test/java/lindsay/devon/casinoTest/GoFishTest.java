package lindsay.devon.casinoTest;

import lindsay.devon.casino.Game;
import lindsay.devon.casino.GoFish;
import lindsay.devon.casino.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/2/16.
 */
public class GoFishTest extends Game {

    @Test
    public void setGameState() {
        Player player = new Player(1, "Name", "lastName", "pin");
        GoFish goFish = new GoFish(player);
        int houseMatches = 7;
        int playerMatches = 3;
        goFish.setGameState();
        State expected = State.LOSS;
        State actual = goFish.state;
        Assert.assertEquals("Game should have been lost",expected,actual);

        // not working because it's asking for user input to place bet...


    }


    public  void play() {}
    public  void updatePlayerBalance(){}
    public  void placeBet(double currentBet) {}
}
