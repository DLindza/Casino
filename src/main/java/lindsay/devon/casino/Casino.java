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
                    menu.output("How much money are you playing with today?");
                    double currentBalance = userInput.inputDouble();
                    Player newPlayer = engine.createNewPlayer(userFirstName,userLastName,userPassword);
                    engine.setInitialPlayerBalance(newPlayer,currentBalance);
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
        this.currentPlayer = engine.getPlayerByPIN(userID, userPassword);
        menu.gameMenu();
        int userSelection = userInput.inputInt();

        switch (userSelection) {
            case 1:
                rouletteMenuSelction();
                break;
            case 2:
                goFishMenuSelection();
                break;
            case 3:
                blackJackMenuSelection();
                break;
            case 4:
                double cashOutValue = engine.getBalance(currentPlayer);
                menu.output("Your current balance is " + cashOutValue);
                menu.output("Please see the cashier to settle your account.");
                menu.output("Goodbye! Hope you had fun!");
                break;
        }
        return this.currentPlayer;
    }


    public void rouletteMenuSelction() {
        menu.rouletteMenu();
        int userSelection = userInput.inputInt();
        switch(userSelection) {
            case 1: menu.rouletteRules();
                break;
            case 2:
                menu.output("Place your bet: ");
                double bet = userInput.inputDouble();
                Game game = engine.createRoulette(currentPlayer);
                engine.placePlayerBet(bet,game);
                engine.playGame(game);
                break;
            case 3: menu.output("Thank you for playing Go Fish!");
        }

    }

    public void goFishMenuSelection() {
            menu.goFishMenu();
            int userSelection = userInput.inputInt();
            switch(userSelection) {
                case 1: menu.goFishRules();
                    break;
                case 2:
                    menu.output("Place your bet: ");
                    double bet = userInput.inputDouble();
                    Game game = engine.createGoFish(currentPlayer);
                    engine.placePlayerBet(bet,game);
                    engine.playGame(game);
                    break;
                case 3: menu.output("Thank you for playing Go Fish!");
            }

        }

    public void blackJackMenuSelection() {
          menu.blackJackMenu();
        int userSelection = userInput.inputInt();
        switch(userSelection) {
            case 1: menu.blackJackRules();
                break;
            case 2: menu.output("Place your bet: ");
                double bet = userInput.inputDouble();
                Game game = engine.createBlackJack(currentPlayer);
                engine.placePlayerBet(bet,game);
                engine.playGame(game);
                break;
            case 3: menu.output("Thank you for playing Go Fish!");
        }

    }





}
