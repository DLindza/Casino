package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class Engine {
    PlayerManager playerManager = new PlayerManager();


    public Player createNewPlayer(String firstName, String lastName, String pin) {
        Player newPlayer = playerManager.createPlayer(firstName, lastName, pin);
        return newPlayer;
    }

    public Player getPlayerByPIN(int playerID, String password) {
        Player currentPlayer = playerManager.getPlayerByPIN(playerID, password);
        return currentPlayer;
    }

    public int getPlayerID(Player newPlayer) {
        return playerManager.getPlayerID(newPlayer);
    }


}