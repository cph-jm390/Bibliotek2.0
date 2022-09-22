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
            // if sprog = dansk
            switch (BrugerInput.getString(sprog.options())) {
                case "1":
                    Bog bog = new Bog(BrugerInput.getString("angiv title"), BrugerInput.getString("angiv forfatter"));
                    bogList.add(Bibliotek.opretBog(bog));
                    break;
                case "2":
                    bogList = Bibliotek.HentBøger();
                    udskriv(bogList);
                    break;
                case "3":
                    System.out.println(Bibliotek.sletBog(BrugerInput.getInt("angiv bog id")));
                    break;
                case "4":
                    try {
                        udskriv(bogList);
                    } catch (NullPointerException e) {
                        System.out.println("\nNo book-havin' ass");
                    }
                case "5":
                    break;
            }
        }
    }
}


