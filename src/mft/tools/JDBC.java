package mft.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "JDBC:oracle:thin:@localhost:1521:xe",
                "javase",
                "java123");
    }
}
