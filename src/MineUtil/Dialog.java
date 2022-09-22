package MineUtil;

import DB.BogMapper;
import Entitet.Bog;
import Entitet.Låner;
import Sprog.Dansk;
import Sprog.Engelsk;
import Sprog.Finsk;
import Sprog.ÆndringAfSprog;
import java.sql.SQLException;
import java.util.List;

public class Dialog {
    static ÆndringAfSprog sprog = new Dansk();

    public static void udskrivBøger(List<Bog> bøger) {

        for (Bog bog : bøger) {
            System.out.println(bog.toString());
        }
    }
    public static void udskrivLånere(List<Låner> lånere){
        for (Låner låner : lånere){
            System.out.println(låner.toString());
        }
    }
    public static void terminalDialog() throws SQLException {
        List<Bog> bogList = null;
        List<Låner> lånerList = null;

        while (true) {

            switch (BrugerInput.getString(sprog.options())) {
                case "1":
                    Bog bog = new Bog(BrugerInput.getString(sprog.angivTitle()), BrugerInput.getString(sprog.angivForfatter()));
                    bogList.add(Bibliotek.opretBog(bog));
                    break;
                case "2":
                    Låner låner = new Låner(BrugerInput.getString(sprog.angivNavn()));
                    lånerList.add(Bibliotek.opretLåner(låner));
                    break;
                case "3":
                    bogList = Bibliotek.HentBøger();
                    udskrivBøger(bogList);
                    break;
                case "4":
                    System.out.println(Bibliotek.sletBog(BrugerInput.getInt(sprog.angivBogID())));
                    break;
                case "5":
                    try {
                        udskrivBøger(bogList);
                    } catch (NullPointerException e) {
                        System.out.println(sprog.exceptionStringMSG());
                    }
                case "6":
                    try{
                        udskrivLånere(lånerList);
                    } catch (Exception e) {
                        System.out.println(sprog.exceptionStringMSG());
                    }
                case "7":
                    BogMapper.flestBøger();
                    break;
                case "8":
                    sprogSkift();
                    break;
            }
        }
    }

    public static void sprogSkift() {
        switch (BrugerInput.getString(sprog.selectLangage())) {
            case "1":
                sprog = new Engelsk();
                break;
            case "2":
                sprog = new Dansk();
                break;
            case "3":
                sprog = new Finsk();
                break;
        }
    }
}



