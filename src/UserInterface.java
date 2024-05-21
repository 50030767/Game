public class UserInterface {
    private InputReader reader;

    private GamesLibrary Library;

    public UserInterface()
    {
        this.reader = new InputReader();
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
        Category aCategory;

        System.out.println("Select a category");
        System.out.println("1. PVP:");
        System.out.println("2. Horror:");
        System.out.println("3. StoryMode:");
        System.out.println("4. Sports:");

        userInput = reader.getInput();

        int categoryNumber = -1;

        try
        {
            downloadSize = Integer.parseInt(userInput);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("The input could not be parse to an int");
            return;
        }

        if (categoryNumber < 1 || categoryNumber > 6)
        {
            System.out.println("That was not a valid option");
            return;
      }
        category categoryNumber = Category.PVP;

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

        Game g = new Game(title, downloadSize, category);
        this.Library.addGame(g);
    }
    public void listGames()
    {
        this.Library.showGames();
    }
    public void showGameCount()
    {
        int count = this.Library.gameCount();

        System.out.println(count);
    }

}
