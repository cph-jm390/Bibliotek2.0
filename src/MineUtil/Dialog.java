package MineUtil;
import Entitet.Bog;
import Sprog.Dansk;
import Sprog.Engelsk;
import Sprog.Finsk;
import Sprog.ÆndringAfSprog;
import java.sql.SQLException;
import java.util.List;

public class Dialog {

    public static void udskriv(List<Bog> bøger) {

        for (Bog bog : bøger) {
            System.out.println(bog.toString());
        }
    }


    public static void terminalDialog() throws SQLException {
        List<Bog> bogList = null;
        ÆndringAfSprog sprog = new Dansk();

        while (true) {

                switch (BrugerInput.getString(sprog.options())) {
                    case "1":
                        Bog bog = new Bog(BrugerInput.getString(sprog.angivTitle()), BrugerInput.getString(sprog.angivForfatter()));
                        bogList.add(Bibliotek.opretBog(bog));
                        break;
                    case "2":
                        bogList = Bibliotek.HentBøger();
                        udskriv(bogList);
                        break;
                    case "3":
                        System.out.println(Bibliotek.sletBog(BrugerInput.getInt(sprog.angivBogID())));
                        break;
                    case "4":
                        try {
                            udskriv(bogList);
                        } catch (NullPointerException e) {
                            System.out.println(sprog.exceptionStringMSG());
                        }
                    case "5":
                        sprog=new Engelsk();
                        break;
                }
            }
        }
    }



