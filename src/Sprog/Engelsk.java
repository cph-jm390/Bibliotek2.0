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
        return "Press 1 for: english" + "\n" +
                "Press 2 for: danish" + "\n" +
                "Press 3 for: finnish"+ "\n";
    }

    @Override
    public String options() {
        return
                "Press 1 for: Create book"+ "\n" +"Press 2 for: Get books" +"\n" +"Press 3 for: Delete book"+"\n" +"Press 4 for: Show book list" + "\n" +"Press 5 for: Change language"+ "\n" +"Press 6 for: Show most popular book";
    }

    @Override
    public String angivForfatter() {
        return "specify author: "+  "\n";
    }

    @Override
    public String angivTitle() {
        return "specify title"+  "\n";
    }

    @Override
    public String angivBogID() {
        return "specify bookID"+"\n";
    }

    @Override
    public String exceptionStringMSG() {
        return "no-book-havin'-ass" +"\n";
    }
    }

