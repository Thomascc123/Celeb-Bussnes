package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL_DB = "jdbc:mariadb://localhost:3307/celebbussnesdb";
    private static final String USER_DB = "root";
    private static final String PASSWORD_DB = "root";

    static Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Conectando a la base de datos...");
            // Le pasamos la URL de la base de datos, el usuario y la contraseña para
            // conectarnos a la base de datos
            connection = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
            System.out.println(connection);
        } catch(ClassNotFoundException e){
            System.out.println("Error: MariaDB JDBC Driver no encontrado.");
        } catch(SQLException e){
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}

