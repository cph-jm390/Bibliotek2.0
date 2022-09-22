package MineUtil;

import DB.BogMapper;
import Entitet.Bog;
import Entitet.Låner;
import java.sql.SQLException;
import java.util.List;

public class Bibliotek {

    public static Bog opretBog(Bog bog) throws SQLException {
        return  BogMapper.opretBog(bog);
    }

    public static Låner opretLåner(Låner låner) throws SQLException{
        return BogMapper.opretLåner(låner);
    }

    public static List<Bog> HentBøger() throws SQLException {
        return BogMapper.hentBøger();
    }

    public static String sletBog(int bog_id) throws SQLException {
        return BogMapper.sletBog(bog_id);
    }

    public static String flestBøger() throws SQLException{
        return null;
    }
}
