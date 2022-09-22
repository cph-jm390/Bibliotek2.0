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
        return "Tryk 1 for: Opret bog"+  "\n" +"Tryk 2 for: hent bøger" +"\n" +"Tryk 3 for: Slet bog"+"\n" +"Tryk 4 for: vis bogliste"+  "\n" +"Tryk 5 for: skift sprog";

    }

}
