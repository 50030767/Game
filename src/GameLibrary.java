import java.util.ArrayList; //imports the arraylist to the program
public class GameLibrary {
    /**
     * creates a librray to store all the added games
     */
    private ArrayList<Game> games;
public GameLibrary()
{
    this.games = new ArrayList<Game>();
}

public void addGame(Game g)
{
    this.games.add(g);
}
public void showGames()
{
    for (Game g : this.games)
    {
        g.showInfo();
    }
}
public int gameCount()
{
    int count = this.games.size();
            return count;
}

}
