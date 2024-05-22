public class Game {
    private String title;

    private int downloadSize;

    private Category category;

    private int size;


    public Game(String aTitle, int aDownloadSize, Category aCategory)
    {
        this.title = aTitle;
        this.downloadSize = aDownloadSize;
        this.category = aCategory;
        this.size = aDownloadSize;

    }

    /**
     * Returns the category of the game
     * @return
     */
    public Category getCategory()
    {
        return category;
    }

    /**
     * Returns the title of the game
     * @return
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * returns the download size of the game
     * @return
     */
    public int getDownloadSize()
    {
        return downloadSize;
    }

    /**
     * shows the info of the game added
     */
    public void showInfo()
    {
        String gInfo = this.getTitle() + "," + this.getCategory() + ", download size;" + this.getDownloadSize() + "size";
        System.out.println(title);
        System.out.println(category);
        System.out.println(downloadSize);

    }

}
