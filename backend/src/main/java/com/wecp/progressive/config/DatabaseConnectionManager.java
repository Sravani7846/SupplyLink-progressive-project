package com.wecp.progressive.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import io.jsonwebtoken.io.IOException;

public class DatabaseConnectionManager {
    private static Connection connection;
    public static Connection getConnection() throws IOException,SQLException{
        if(connection == null){
            Properties properties = new Properties();
            properties.load(DatabaseConnectionManager.class.getClassloader().getResourceAsStream("application.properties"));
            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
