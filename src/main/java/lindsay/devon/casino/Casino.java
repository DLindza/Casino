package lindsay.devon.casino;

/**
 * Created by devon on 10/2/16.
 */
public class Casino {
    Menu menu;
    UserInput userInput;
    Engine engine;
    Player currentPlayer;

    public void start() {
        menu = new Menu();
        userInput = new UserInput();
        engine = new Engine();
        casinoMainMenu();
    }

    public void casinoMainMenu() { welcomeMenuSelection(); }



    public void welcomeMenuSelection() {
        while (true) {
            menu.welcomeMenu();
            int userSelection = userInput.inputInt();

            switch (userSelection) {
                case 1:
                    menu.output("Please enter your first name");
                    String userFirstName = userInput.inputString();
                    menu.output("Please enter your last name");
                    String userLastName = userInput.inputString();
                    menu.output("Please create a password");
                    String userPassword = userInput.inputString();
                    Player newPlayer = engine.createNewPlayer(userFirstName,userLastName,userPassword);
                    menu.output("Your player ID is: " + engine.getPlayerID(newPlayer));
                    break;
                case 2:
                    gameMenuSelection();
                    break;
                case 3:
                    menu.output("Thank you for playing at the Devon Casino!");
                    break;
            }
            if (userSelection == 3) { break;}
        }
    }

    public Player gameMenuSelection() {
        menu.output("Please enter your Player ID");
        int userID = userInput.inputInt();
        menu.output("Please enter your password");
        String userPassword = userInput.inputString();
        this.currentPlayer = engine.getPlayerByPIN(userID,userPassword);
        menu.gameMenu();
        int userSelection = userInput.inputInt();

        switch(userSelection) {
            case 1: //rouletteMainMenu();
                break;
            case 2: //goFishMainMenu();
                break;
            case 3: //blackJackMainMenu();
                break;
            case 4: menu.output("Goodbye! Hope you had fun!");
                break;
        }
        return this.currentPlayer;
    }


}
