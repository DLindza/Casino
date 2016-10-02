package lindsay.devon.casinoTest;

import lindsay.devon.casino.Engine;
import lindsay.devon.casino.PlayerManager;
import lindsay.devon.casino.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by devon on 10/2/16.
 */
public class EngineTest {
    @Test
    public void createPlayerTest() {

        Engine engine = new Engine();
        PlayerManager playerManager = new PlayerManager();
        engine.createNewPlayer("Devon","Lindsay", "pizza");
        int expected = 1;
        int actual = PlayerManager.players.size();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getPlayerByPINTest() {
        Engine engine = new Engine();
        PlayerManager playerManager = new PlayerManager();
        Player expected = engine.createNewPlayer("Devon","Lindsay", "pizza");
        Player actual = engine.getPlayerByPIN(1,"pizza");
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setPlayerBalanceTest() {
        Engine engine = new Engine();
        PlayerManager playerManager = new PlayerManager();
        Player player = engine.createNewPlayer("Devon","Lindsay", "pizza");
        engine.setInitialPlayerBalance(player,1000);
        double expected = 1000;
        double actual = engine.getBalance(player);
        Assert.assertEquals(expected,actual,1);
    }

}
