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
                "Paina 3 vaihtaaksesi kielen suomeksi";
    }

    @Override
    public String options() {
        return "Paina 1: Luo kirja"+ "\n" +"Paina 2: hanki kirjoja" +"\n" +"Paina 3: Poista kirja"+"\n" +"Paina 4: näytä kirjaluettelo " + "\n" +"Paina 5: vaihda kieli";
    }

}
