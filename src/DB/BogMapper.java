package DB;

import Entitet.Bog;

import java.sql.*;

public class BogMapper {

    protected static Bog opretBog(Bog bog) throws SQLException {
        String sql = "INSERT INTO BogTabel (Forfatter , Title ) VALUES (?, ?)";

        try (Connection con = ConnectionConfiguration.getConnection();

             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {

            try {
                ps.setString(1, bog.getForfatter());
                ps.setString(2, bog.getTitle());
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
}
