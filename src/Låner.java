public class Låner {
    int idLånere;
    String LånerNavn;
    public Låner(int idLånere, String lånerNavn) {
        this.idLånere = idLånere;
        LånerNavn = lånerNavn;
    }

    public int getIdLånere() {
        return idLånere;
    }

    public void setIdLånere(int idLånere) {
        this.idLånere = idLånere;
    }

    public String getLånerNavn() {
        return LånerNavn;
    }

    public void setLånerNavn(String lånerNavn) {
        LånerNavn = lånerNavn;
    }
}
