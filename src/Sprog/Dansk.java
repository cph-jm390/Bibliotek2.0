package Sprog;

public class Dansk extends ÆndringAfSprog {

    @Override
    public String hi() {
        return "Hej og velkommen til slackergruppens bibliotek!";
    }

    @Override
    public String changelanguage() {

        return "\nTryk 1 for at skifte sprog.";
    }

    @Override
    public String selectLangage() {
        return "Tryk 1 for: engelsk" + "\n" +
                "Tryk 2 for: dansk" + "\n" +
                "Tryk 3 for: finsk"+ "\n";
    }

    @Override
    public String options() {
        return "Tryk 1 for: Opret bog"+ "\n" +
                "Tryk 2 for: Opret låner" + "\n" +
                "Tryk 3 for: Hent bøger"+ "\n" +
                "Tryk 4 for: Slet bog"+ "\n" +
                "Tryk 5 for: Vis bogliste" + "\n" +
                "Tryk 6 for: Vis lånerliste"+ "\n" +
                "Tryk 7 for: Vis mest populære bog"+ "\n" +
                "Tryk 8 for: Skift sprog";
    }

    @Override
    public String angivForfatter() {
        return "angiv forfatter: "+  "\n";
    }

    @Override
    public String angivTitle() {
        return "angiv title"+  "\n";
    }

    @Override
    public String angivBogID() {
        return "angiv bogID"+"\n";
    }

    @Override
    public String exceptionStringMSG() {
        return "Ingen-bog-havende-røv"+"\n";
    }

    @Override
    public String angivNavn() {
        return "angiv navn" + "\n";
    }
}


