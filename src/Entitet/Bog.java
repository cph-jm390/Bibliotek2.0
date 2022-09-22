package Entitet;

public class Bog
{

    private static int bogID;
    private static String titel;
    private String forfatter;

    public Bog(int bogId, String title, String forfatter)  // det er fra min DB til opbjekt
    {
        this.bogID = bogId;
        this.titel = title;
        this.forfatter = forfatter;
    }

    public Bog(String title, String forfatter)  // fra objekt til DB (første gang)
    {
        this.titel = title;
        this.forfatter = forfatter;
    }

    public static int getBogID()
    {
        return bogID;
    }

    public void setBogId(int bogId)
    {
        this.bogID = bogId;
    }

    public static String getTitel() {return titel;}

    public void setTitel(String titel)
    {
        this.titel = titel;
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
        return "Bog{" + "bogId=" + bogID + ", title='" + titel + '\'' + ", forfatter='" + forfatter + '\'' + '}';
    }
}