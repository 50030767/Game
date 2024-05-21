import java.util.ArrayList;
public class GameLibrary {
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
