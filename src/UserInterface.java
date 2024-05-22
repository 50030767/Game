public class UserInterface {
    private InputReader reader;

    private GameLibrary Library;

    public UserInterface()
    {
        this.reader = new InputReader();
        this.Library = new GameLibrary();
    }

    public void showMainMenu()
    {
        boolean quit = false;

        while (quit == false)
        {
            System.out.println("please select an option");
            System.out.println("1. add a new game");
            System.out.println("2 show all games");
            System.out.println("3 show game count");
            System.out.println("0 Quit");

            String userInput = reader.getInput();

            switch (userInput)
            {
                case "1":
                    addGame();
                    break;
                case "2":
                    this.listGames();
                    break;
                case "3":
                    this.showGameCount();
                    break;
                case "0":
                    quit = true;
                    break;

                default:
                    System.out.println("Invalid choice");

            }
        }
    }

    public void addGame()
    {
        /**
         * allows the user to input a game to store in the GameLibrary
         */
        System.out.println("Enter the name of the game");
        String title = reader.getInput();

        System.out.println("Enter the download size of the game");
        String userInput = reader.getInput();
        int downloadSize = 0;

        try
        {
            downloadSize = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Invalid download size");
            return;
        }
        //Category aCategory;
/**
 * displays the different categories to the user
 */
        System.out.println("Select a category");
        System.out.println("1. PVP:");
        System.out.println("2. Horror:");
        System.out.println("3. StoryMode:");
        System.out.println("4. Sports:");

        userInput = reader.getInput();

        int categoryNumber = -1;

        try
        {
            categoryNumber = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("The input could not be parse to an int");
            return;
        }

        if (categoryNumber <= 0 && categoryNumber > 4)
        {
            System.out.println("That was not a valid option");
            return;
      }
        Category category = Category.PVP;
        System.out.println(categoryNumber);

        switch (categoryNumber)
        {
            case 1:
                category = Category.PVP;
                break;
            case 2:
                category = Category.HORROR;
                break;
            case 3:
                category = Category.STORYMODE;
                break;
            case 4:
                category = Category.SPORTS;
                break;
        }
        System.out.println(categoryNumber);

        Game g = new Game(title, downloadSize, category);
        this.Library.addGame(g);
    }

    /**
     * allows the user view the games stored in the GameLibrary
     */
    public void listGames()
    {
        this.Library.showGames();
    }

    /**
     * displays the number of games available in the GameLibrary
     */
    public void showGameCount()
    {
        int count = this.Library.gameCount();

        System.out.println(count);
    }

}
