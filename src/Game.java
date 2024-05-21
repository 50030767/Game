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

    public Category getCategory()
    {
        return category;
    }

    public String getTitle()
    {
        return title;
    }

    public int getDownloadSize()
    {
        return downloadSize;
    }

    public void showInfo()
    {
        String gInfo = this.getTitle() + "," + this.getCategory() + ", download size;" + this.getDownloadSize() + "size";
        System.out.println(title);
        System.out.println(category);
        System.out.println(downloadSize);

    }

}
