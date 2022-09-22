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
}
