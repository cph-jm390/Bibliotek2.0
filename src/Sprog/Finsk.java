package Sprog;

public class Finsk extends ÆndringAfSprog{

    @Override
    public String hi() {
        return "Hei ja tervetuloa slackergroupsin kirjastoon!";
    }
    @Override
    public String changelanguage() {
        return "Lehdistö 1 varten : Vaihda kieltä";
    }

    public String selectLangage() {
        return "Paina 1 vaihtaaksesi kielen englanti" + "\n" +
                "Paina 2 vaihtaaksesi kielen yanskan kieli" + "\n" +
                "Paina 3 vaihtaaksesi kielen suomeksi"+ "\n";
    }

    @Override
    public String options() {
        return "Paina 1: Luo kirja"+ "\n" +"Paina 2: Hanki kirjoja" +"\n" +"Paina 3: Poista kirja"+"\n" +"Paina 4: Näytä kirjaluettelo " + "\n" +"Paina 5: Vaihda kieli"+"\n" +"Paina 6: Näytä suosituin kirja";
    }

    @Override
    public String angivForfatter() {
        return "määritä tekijä"+"\n";
    }

    @Override
    public String angivTitle() {
        return "määritä otsikko"+"\n";

    }

    @Override
    public String angivBogID() {
        return "määritä kirjan tunnus"+"\n";
    }

    @Override
    public String exceptionStringMSG() {
        return "ei-kirja-having-ass"+"\n";
    }

}
