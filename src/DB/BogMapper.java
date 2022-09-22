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

            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
            return bog;
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

    public static String bogUdlån() {
        String sql = "INSERT INTO UdlånsTabel (bogID, lånerID, bogTitel) VALUES (?,?,?)";

        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            try {
                ps.setInt(1, Bog.getBogID());
                ps.setInt(2, Låner.getLånerID());
                ps.setString(3, Bog.getTitel());
                ps.executeUpdate();

                ResultSet resultSet = ps.getGeneratedKeys();
                resultSet.next();
                Låner.setLånerID(resultSet.getInt(1));

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return bogUdlån();
    }


    /*
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

     */
}
