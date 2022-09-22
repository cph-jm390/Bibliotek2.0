package Entitet;

public class Bog
{

    private int bogId;
    private String title;
    private String forfatter;

    public Bog(int bogId, String title, String forfatter)  // det er fra min DB til opbjekt
    {
        this.bogId = bogId;
        this.title = title;
        this.forfatter = forfatter;
    }

    public Bog(String title, String forfatter)  // fra objekt til DB (første gang)
    {
        this.title = title;
        this.forfatter = forfatter;
    }

    public int getBogId()
    {
        return bogId;
    }

    public void setBogId(int bogId)
    {
        this.bogId = bogId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getForfatter()
    {
        return forfatter;
    }

    public void setForfatter(String forfatter)
    {
        this.forfatter = forfatter;
    }

    @Override
    public String toString()
    {
        return "Bog{" + "bogId=" + bogId + ", title='" + title + '\'' + ", forfatter='" + forfatter + '\'' + '}';
    }
}