package DB;

import MineUtil.BrugerInput;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration
{
    private static String pass = null;

    public static Connection getConnection() {

        if (pass == null) {

            pass = BrugerInput.getString("angiv password");

        }

        Connection connection = null;
        String url = "jdbc:mysql://localhost:3306/Bibliotek?serverTimezone=CET&useSSL=false";
        String user = "root";
        String password = pass;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}