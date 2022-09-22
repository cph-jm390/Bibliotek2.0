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
        return "\nTryk 2 for at skifte sprog til engelsk." +
                "\nTryk 3 for at skifte sprog til finsk.";
    }
}


