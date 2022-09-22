package MineUtil;

import Entitet.Bog;
import MineUtil.BrugerInput;

import java.sql.SQLException;
import java.util.List;

public class Dialog {

    public static void udskriv(List<Bog> bøger) {

        for (Bog bog : bøger) {

            System.out.println(bog.toString());
        }
    }


        public static void terminalDialog() throws SQLException{
            List<Bog> bogList = null;
            while (true) {
                switch (BrugerInput.getString("hvad ønsker du")) {
                    case "poggers":
                        break;
                    case "gamers":
                        break;
                    case "vis kartotek":
                        try
                        {
                            udskriv(bogList);
                        }
                        catch(NullPointerException e)
                        {
                            System.out.println("\nNo book-havin' ass");
                        }

                }
            }
        }
    }

