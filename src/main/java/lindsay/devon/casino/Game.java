package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public abstract class Game {
    public enum State {WIN, LOSS, TIE, PLAYING}
    House house;

    Double currentBet;
    Double pot;

   public abstract void play();
   public abstract void setGameState();
   public abstract void updatePlayerBalance();
   public abstract void placeBet(double currentBet);
}
