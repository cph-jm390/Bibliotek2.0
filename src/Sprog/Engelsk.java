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
        return
                "Press 1 for: Create book"+ "\n" +"Press 2 for: get books" +"\n" +"Press 3 for: Delete book"+"\n" +"Press 4 for: show book list" + "\n" +"Press 5 for: change language";
    }
}
