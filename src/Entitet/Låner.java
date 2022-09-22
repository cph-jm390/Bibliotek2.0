package Entitet;

public class Låner {
    static int lånerID;
    String LånerNavn;

    public Låner(int idLånere, String lånerNavn) {
        this.lånerID = idLånere;
        LånerNavn = lånerNavn;
    }

    public static int getLånerID() {
        return lånerID;
    }

    public static void setLånerID(int lånerID) {
        this.lånerID = lånerID;
    }

    public String getLånerNavn() {
        return LånerNavn;
    }

    public void setLånerNavn(String lånerNavn) {
        LånerNavn = lånerNavn;
    }
}
