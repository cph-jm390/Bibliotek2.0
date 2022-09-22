package Entitet;

public class Låner {

    private static int lånerID;
    private static String lånerNavn;

    public Låner(int lånerID, String lånerNavn) {
        this.lånerID = lånerID;
        this.lånerNavn = lånerNavn;
    }

    public Låner(String lånerNavn){
        this.lånerNavn = lånerNavn;
    }

    public static int getLånerID() {
        return lånerID;
    }

    public void setLånerID(int lånerID) {
        this.lånerID = lånerID;
    }

    public String getLånerNavn() {
        return lånerNavn;
    }

    public void setLånerNavn(String lånerNavn) {
        this.lånerNavn = lånerNavn;
    }

    @Override
    public String toString() {
        return "Låner{" + "LånerNavn='" + lånerNavn + '\'' + "LånerID"+ lånerID +'}';
    }
}
