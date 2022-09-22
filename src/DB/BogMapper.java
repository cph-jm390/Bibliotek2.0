package DB;

import Entitet.Bog;
import Entitet.Låner;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class BogMapper {

    public static Bog opretBog(Bog bog) throws SQLException {
        String sql = "INSERT INTO BogTabel (forfatter , titel ) VALUES (?, ?)";

        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            try {
                ps.setString(1, bog.getForfatter());
                ps.setString(2, bog.getTitel());
                ps.executeUpdate();

                ResultSet resultSet = ps.getGeneratedKeys();
                resultSet.next();
                bog.setBogId(resultSet.getInt(1));
                return bog;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Låner opretLåner(Låner låner) throws SQLException {
        String sql = "INSERT INTO LånerTabel (navn) VALUES (?)";

        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            try {
                ps.setString(1, låner.getLånerNavn());
                ps.executeUpdate();

                ResultSet resultSet = ps.getGeneratedKeys();
                resultSet.next();
                låner.setLånerID(resultSet.getInt(1));
                return låner;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static List<Bog> hentBøger() throws SQLException {
        List<Bog> bogList = new LinkedList<>();
        String sql = "SELECT * FROM BogTabel";

        try (Connection con = ConnectionConfiguration.getConnection();  // får en connection

             // se evt. https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
             PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int idBog = resultSet.getInt("idBogTabel");
                String forfatter = resultSet.getString("Forfatter");
                String title = resultSet.getString("title");
                bogList.add(new Bog(idBog, title, forfatter));
            }
            return bogList;
        }
    }

    public static String sletBog(int bog_id) throws SQLException {
        String sql = "delete from BogTabel where idBog = ?";

        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, bog_id);
            int res = ps.executeUpdate();
            if (res > 0) {
                return "en bog med bog id " + bog_id + " er nu slettet";
            }
            return "kunne ikke finde boget med id " + bog_id;
        }
    }

    public static Låner bogUdlån(Låner låner, Bog bog) throws SQLException{
        String sql = "INSERT INTO UdlånsTabel (bogID, lånerID, bogTitel) VALUES (?,?,?)";

        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            try {
                ps.setInt(1, bog.getBogID());
                ps.setInt(2, låner.getLånerID());
                ps.setString(3, bog.getTitel());
                ps.executeUpdate();

                ResultSet resultSet = ps.getGeneratedKeys();
                resultSet.next();
                låner.setLånerID(resultSet.getInt(1));
                return låner;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String flestBøger() {
        String sql = " select Top 1 titel From BogTabel group by titel order by count(*) desc";
        String mestPopulæreBog = " ";
        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);) {
             ResultSet res = ps.executeQuery();

             while (res.next()){
                 return "Mest udlånte bog er: " + mestPopulæreBog;
             }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return mestPopulæreBog;
    }
}
