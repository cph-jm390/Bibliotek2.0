package MineUtil;
import Entitet.Bog;
import Sprog.Dansk;
import Sprog.Engelsk;
import Sprog.Finsk;
import Sprog.ÆndringAfSprog;
import java.sql.SQLException;
import java.util.List;

public class Dialog {
    static ÆndringAfSprog sprog = new Dansk();

    public static void udskriv(List<Bog> bøger) {

        for (Bog bog : bøger) {
            System.out.println(bog.toString());
        }
    }


    public static void terminalDialog() throws SQLException {
        List<Bog> bogList = null;


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
                        sprogSkift();

                        break;
                }
            }


        }

        public static void sprogSkift(){
            switch(BrugerInput.getString(sprog.selectLangage())){
                case "1":
                    sprog= new Engelsk();
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



