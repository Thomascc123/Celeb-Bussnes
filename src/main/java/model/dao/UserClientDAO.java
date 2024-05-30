package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controller.beansDB.UserClient;

public class UserClientDAO {

    // SQL Queries para hacer el CRUD (Create, Read, Update, Delete)
    private static final String INSERT_USER_CLIENT = "INSERT INTO user_client (userName," +
                                                                        "password," +
                                                                        "isCelebrity," +
                                                                        "hasBankAccount," +
                                                                        "personID)" +
                                                                        "VALUES" + 
                                                                        "(?, ?, ?, ?, ?)";
    private static final String SELECT_USER_CLIENT_ID = "SELECT * FROM user_client WHERE clientID = ?";
    private static final String SELECT_USER_USERNAME = "SELECT * FROM user_client WHERE userName = ?";
    private static final String SELECT_ALL = "SELECT * FROM user_client";
    private static final String DELETE_USER = "DELETE FROM user_client WHERE clientID = ?";
    private static final String UPDATE_USER = "UPDATE user_client SET password = ?," +
                                                                   "hasBankAccount = ?" +
                                                                   "WHERE clientID = ?";
    
    public void insertClient(UserClient newClient){
        
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_CLIENT)) {
            preparedStatement.setString(1, newClient.getUserName());
            preparedStatement.setString(2, newClient.getPassword());
            preparedStatement.setBoolean(3, newClient.isCelebrity());
            preparedStatement.setBoolean(4, newClient.hasBankAccount());
            preparedStatement.setInt(5, newClient.getPersonID());
            
            preparedStatement.executeUpdate();
            System.out.println("Usuario insertado exitosamente a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar un usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public void updateClient(int clientID, String password, boolean hasAccount){
        
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER)) {

            preparedStatement.setString(1, password);
            preparedStatement.setBoolean(2, hasAccount);
            preparedStatement.setInt(3, clientID);
            
            preparedStatement.executeUpdate();
            System.out.println("Usuario actualizado exitosamente en la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public UserClient selectClientByID(int clientID){
        
        UserClient client = null;
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_CLIENT_ID)) {
            preparedStatement.setInt(1, clientID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                client = new UserClient();
                client.setClientID(resultSet.getInt("clientID"));
                client.setUserName(resultSet.getString("userName"));
                client.setPassword(resultSet.getString("password"));
                client.setCelebrity(resultSet.getBoolean("isCelebrity"));
                client.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                client.setPersonID(resultSet.getInt("personID"));
            }
            System.out.println("Usurario encontrado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al buscar al usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
        return client;
    }

    public boolean userNameInUse(String username){

        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_USERNAME)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                DBConnection.closeConnection(connection);
                return true;
            }
            System.out.println("Usurario encontrado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al buscar al usuario: " + e.getMessage());  
            return true;
        }
        return false;
        
    }

    public UserClient selectUserByUserName(String username){

        UserClient client = null;
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_USERNAME)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                client = new UserClient();
                client.setClientID(resultSet.getInt("clientID"));
                client.setUserName(resultSet.getString("userName"));
                client.setPassword(resultSet.getString("password"));
                client.setCelebrity(resultSet.getBoolean("isCelebrity"));
                client.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                client.setPersonID(resultSet.getInt("personID"));
            }
            System.out.println("Usurario encontrado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al buscar al usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
        return client;
    }

    public void deleteUser(int clientID){

        Connection connection = DBConnection.getConnection();
        try (
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER)){

               preparedStatement.execute();
       } catch(SQLException e){
           System.out.println("Error al eliminar usuario con id: "+clientID);
       }

       DBConnection.closeConnection(connection);
    }

    public List<UserClient> selectAllClients(){

        List<UserClient> users = new ArrayList<UserClient>();
        Connection connection = DBConnection.getConnection();

        try (
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)){
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    UserClient client = new UserClient();
                    client.setClientID(resultSet.getInt("clientID"));
                    client.setUserName(resultSet.getString("userName"));
                    client.setPassword(resultSet.getString("password"));
                    client.setCelebrity(resultSet.getBoolean("isCelebrity"));
                    client.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                    client.setPersonID(resultSet.getInt("personID"));
                    users.add(client);
                }
       } catch(SQLException e){
           System.out.println("Error al leer la base de datos: ");
       }

       DBConnection.closeConnection(connection);
       return users;
    }

}
