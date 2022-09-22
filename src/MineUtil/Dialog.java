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
        while (true) {
            switch (BrugerInput.getString("hvad ønsker du")) {
                case "opret bog":
                    Bog bog = new Bog(BrugerInput.getString("angiv title"), BrugerInput.getString("angiv forfatter"));
                    bogList.add(Bibliotek.opretBog(bog));
                    break;
                case "hent bøger":
                    bogList = Bibliotek.HentBøger();
                    udskriv(bogList);
                    break;
                case "slet bog":
                    System.out.println(Bibliotek.sletBog(BrugerInput.getInt("angiv bog id")));
                    break;
                case "vis bogliste":
                    try {
                        udskriv(bogList);
                    } catch (NullPointerException e) {
                        System.out.println("\nNo book-havin' ass");
                    }
            }
        }
    }
}


