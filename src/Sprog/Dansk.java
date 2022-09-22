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
        return "Tryk 1 for: Opret bog"+  "\n" +"Tryk 2 for: hent bøger" +"\n" +"Tryk 3 for: Slet bog"+"\n" +"Tryk 4 for: vis bogliste"+  "\n" +"Tryk 5 for: skift sprog";

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
}


