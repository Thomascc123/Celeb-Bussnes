package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectionDB {
    private static final String URL_DB = "jdbc:mariadb://localhost:3307/celebBussnesDB";
    private static final String USER_DB = "root";
    private static final String PASSWORD_DB = "root";

    public static Connection getConnection(){
        Connection connection = null;

        try {
          Class.forName("org.mariadb.jdbc.Driver");
          connection = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
          System.out.println(connection);
        } catch (ClassNotFoundException e) {
          System.out.println("Error: MariaDB JDBC Driver no encontrado.");
        } catch (SQLException e) {
          System.out.println("Error al conectar a la base de datos: " + e.getMessage());
          e.printStackTrace();
        }

        return connection;
    }

}
