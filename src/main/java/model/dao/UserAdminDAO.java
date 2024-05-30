package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.beansDB.UserAdmin;

public class UserAdminDAO {

    // SQL Queries para hacer el CRUD (Create, Read, Update, Delete)
    private static final String INSERT_ADMIN = "INSERT INTO user_admin (userName," +
                                                                        "password," +
                                                                        "salary," +
                                                                        "hasBankAccount," +
                                                                        "personID)" +
                                                                        "VALUES" + 
                                                                        "(?, ?, ?, ?, ?)";
    private static final String SELECT_ADMIN_ID = "SELECT * FROM user_admin WHERE adminID = ?";
    private static final String SELECT_ADMIN_USERNAME = "SELECT * FROM user_admin WHERE userName = ?";
    private static final String SELECT_ALL = "SELECT * FROM user_admin";
    private static final String DELETE_ADMIN = "DELETE FROM user_admin WHERE adminID = ?";
    private static final String UPDATE_ADMIN = "UPDATE user_admin SET password = ?," +
                                                                   "hasBankAccount = ?" +
                                                                   "WHERE adminID = ?";
    
    public void insertAdmin(UserAdmin newAdmin){
        
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ADMIN)) {
            preparedStatement.setString(1, newAdmin.getUserName());
            preparedStatement.setString(2, newAdmin.getPassword());
            preparedStatement.setDouble(3, newAdmin.getSalary());
            preparedStatement.setBoolean(4, newAdmin.hasBankAccount());
            preparedStatement.setInt(5, newAdmin.getPersonID());
            
            preparedStatement.executeUpdate();
            System.out.println("Usuario insertado exitosamente a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar un usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public void updateAdmin(int adminID, String password, boolean hasBankAccount){
        
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ADMIN)) {

            preparedStatement.setString(1, password);
            preparedStatement.setBoolean(2, hasBankAccount);
            preparedStatement.setInt(3, adminID);
            
            preparedStatement.executeUpdate();
            System.out.println("Usuario actualizado exitosamente en la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al actualizar el usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public UserAdmin selectClientByID(int adminID){
        
        UserAdmin admin = null;
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ADMIN_ID)) {
            preparedStatement.setInt(1, adminID);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                admin = new UserAdmin();
                admin.setAdminID(resultSet.getInt("adminID"));
                admin.setUserName(resultSet.getString("userName"));
                admin.setPassword(resultSet.getString("password"));
                admin.setSalary(resultSet.getDouble("salary"));
                admin.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                admin.setPersonID(resultSet.getInt("personID"));
            }
            System.out.println("Administrador encontrado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al buscar al administrador: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
        return admin;
    }

    public boolean userNameInUse(String username){

        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ADMIN_USERNAME)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                DBConnection.closeConnection(connection);
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar al usuario: " + e.getMessage());  
            return true;
        }
        return false;
        
    }

    public UserAdmin selectAdminByUserName(String username){

        UserAdmin admin = null;
        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ADMIN_USERNAME)) {
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                admin = new UserAdmin();
                admin.setAdminID(resultSet.getInt("adminID"));
                admin.setUserName(resultSet.getString("userName"));
                admin.setPassword(resultSet.getString("password"));
                admin.setSalary(resultSet.getDouble("salary"));
                admin.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                admin.setPersonID(resultSet.getInt("personID"));
            }
            System.out.println("Administrador encontrado exitosamente");
        } catch (SQLException e) {
            System.out.println("Error al buscar al administrador: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
        return admin;
    }

    public void deleteAdmin(int adminID){

        Connection connection = DBConnection.getConnection();
        try (
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ADMIN)){

               preparedStatement.execute();
       } catch(SQLException e){
           System.out.println("Error al eliminar administrador con id: "+adminID);
       }

       DBConnection.closeConnection(connection);
    }

    public List<UserAdmin> selectAllClients(){

        List<UserAdmin> users = new ArrayList<UserAdmin>();
        Connection connection = DBConnection.getConnection();

        try (
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)){
                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    UserAdmin admin = new UserAdmin();
                    admin.setAdminID(resultSet.getInt("adminID"));
                    admin.setUserName(resultSet.getString("userName"));
                    admin.setPassword(resultSet.getString("password"));
                    admin.setSalary(resultSet.getDouble("salary"));
                    admin.setHasBankAccount(resultSet.getBoolean("hasBankAccount"));
                    admin.setPersonID(resultSet.getInt("personID"));
                    users.add(admin);
                }
       } catch(SQLException e){
           System.out.println("Error al leer la base de datos: ");
       }

       DBConnection.closeConnection(connection);
       return users;
    }

}

