import Entitet.Bog;
import MineUtil.BrugerInput;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws SQLException {
        List<Bog> bogList = null;

        while (true) {
            switch (BrugerInput.getString("hvad ønsker du")) {
                case "poggers":
                    break;
                case "gamers":
                    break;
                case "vis kartotek":
                    try {
                        udskriv(bogList);
                    }catch(NullPointerException e){
                        System.out.println("\nNo book-havin' ass");
                    }

            }


        }

    }

    public static void udskriv(List<Bog> bøger) {

        for (Bog bog : bøger) {

            System.out.println(bog.toString());
        }

    }
}

