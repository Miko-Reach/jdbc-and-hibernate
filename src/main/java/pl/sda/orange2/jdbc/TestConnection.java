package pl.sda.orange2.jdbc;

import pl.sda.orange2.jdbc.config.H2Config;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

    public static void main(String[] args) {

        String query = """
                SELECT ID, NAME FROM TEST """;

        try {

            //WE need jdbc driver (h2 dependency at pom)
            //Connection gave us acces to existing
            var H2Connection = DriverManager.getConnection(H2Config.DB_URL,
                    H2Config.USER,
                    H2Config.PASSWORD);
            System.out.println("got connection:" + (H2Connection != null));

            Statement queryStatement = H2Connection.createStatement();
            ResultSet queryResult = queryStatement.executeQuery(query);
            queryResult.next();
            System.out.println("id: " + queryResult.getInt(1));
            System.out.println("name: " + queryResult.getString(2));

        } catch (SQLException exc) {
            System.out.println("got exception: " + exc);
            exc.printStackTrace();

        }
    }
}