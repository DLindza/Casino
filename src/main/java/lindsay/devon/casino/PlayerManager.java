package lindsay.devon.casino;

import java.util.ArrayList;

/**
 * Created by devon on 10/2/16.
 */
public class PlayerManager {
    public static ArrayList<Player> players = new ArrayList<Player>();
    private int playerIDCounter = 1;


    Player createPlayer(String firstName, String lastName, String pin) {
        Player player = new Player(playerIDCounter, firstName, lastName, pin);
        addPlayerToList(player);
        playerIDCounter++;
        return player;
    }

    Player getPlayerByPIN(int playerID, String pin) {
        for(Player player: players) {
            if(player.getPin().equals(pin) && player.getID() == playerID)  {
                return player;
            }
        }
        return null;
    }

    void addPlayerToList(Player player) {
        players.add(player);
    }

    int getPlayerID(Player newPlayer) { return newPlayer.getID(); }

    double getPlayerBalance(Player currentPlayer) {
        return currentPlayer.getBalance();
    }

    void setPlayerBalance(Player currentPlayer, double moneyAmount) {
        currentPlayer.setBalance(moneyAmount);
    }


}
