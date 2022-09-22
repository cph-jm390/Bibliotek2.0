package Sprog;

public class Engelsk extends ÆndringAfSprog{

    @Override
    public String hi() {
        return "Hello and welcome to the slackergroups library!";
    }
    @Override
    public String changelanguage() {
        return "Press 1 to change language.";
    }

    @Override
    public String selectLangage() {
        return "Press 1 for english" + "\n" + "Press 2 for danish" + "\n" + "Press 3 for finnish";
    }

    @Override
    public String options() {
        return "Tryk 1 for: Opret bog"+  "\n" +"Tryk 2 for: hent bøger" +"\n" +"Tryk 3 for: Slet bog"+"\n" +"Tryk 4 for: vis bogliste"+  "\n" +"Tryk 5 for: skift sprog";

    }
}
