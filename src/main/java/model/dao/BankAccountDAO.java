package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controller.beansDB.BankAccount;

public class BankAccountDAO {

    // SQL Queries para hacer el CRUD (Create, Read, Update, Delete)
    private static final String INSERT_ACCOUNT = "INSERT INTO bank_account (accountNumber," +
                                                                        "personID," +
                                                                        "balance," +
                                                                        "isActive," +
                                                                        "isCancelled," +
                                                                        "isEmbargoed," +
                                                                        "embargoedValue," +
                                                                        "annualInterest," +
                                                                        "openDate," +
                                                                        "cancelationDate)" +
                                                                        "VALUES" + 
                                                                        "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ACCOUNT_NUMBER = "SELECT * FROM bank_account WHERE accountNumber = ?";
    private static final String SELECT_ACCOUNT_USER_ID = "SELECT * FROM bank_account WHERE userName = ?";
    private static final String SELECT_ALL = "SELECT * FROM bank_account";
    private static final String DELETE_ACCOUNT = "DELETE FROM bank_account WHERE accountNumber = ?";
    private static final String UPDATE_BALANCE = "UPDATE bank_account SET balance = ? WHERE" +
                                                                   "accountNumber = ?)";

    public void insertAccount(BankAccount account){

        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT)) {
            preparedStatement.setInt(1, account.getAccountNumber());
            preparedStatement.setInt(2, account.getPersonID());
            preparedStatement.setDouble(3, account.getBalance());
            preparedStatement.setBoolean(4, account.isActive());
            preparedStatement.setBoolean(5, account.isCancelled());
            preparedStatement.setBoolean(6, account.isEmbargoed());
            preparedStatement.setDouble(7, account.getEmbargoedValue());
            preparedStatement.setDouble(8, account.getAnnualInterest());
            preparedStatement.setDate(9, account.getOpenDate());
            preparedStatement.setDate(10, account.getCancelationDate());
            preparedStatement.executeUpdate();
            System.out.println("Cuenta creada exitosamente en la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar cuenta: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public void updateBalance(int accountNumber, double balance){

        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BALANCE)) {
            preparedStatement.setDouble(1, balance);
            preparedStatement.setInt(2, accountNumber);
            preparedStatement.executeUpdate();
            System.out.println("Actualización correcta de saldo");
        } catch (SQLException e) {
            System.out.println("Error al insertar cuenta: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public void deleteAccount(int accountNumber){

        Connection connection = DBConnection.getConnection();
        
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ACCOUNT)) {
            preparedStatement.setInt(1, accountNumber);
            preparedStatement.execute();
            System.out.println("Cuenta eliminada");
        } catch (SQLException e) {
            System.out.println("Error al eliminar cuenta: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);

    }

    public BankAccount selectAccountByNumber(int accountNumber){

        BankAccount account = null;
        Connection connection = DBConnection.getConnection();

        try(
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_NUMBER)){
                preparedStatement.setInt(1, accountNumber);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    account = new BankAccount();
                    account.setAccountNumber(accountNumber);
                    account.setPersonID(resultSet.getInt("personID"));
                    account.setBalance(resultSet.getDouble("balance"));
                    account.setActive(resultSet.getBoolean("isActive"));
                    account.setCancelled(resultSet.getBoolean("isCancelled"));
                    account.setEmbargoed(resultSet.getBoolean("isEmbargoed"));
                    account.setEmbargoedValue(resultSet.getDouble("embargoedValue"));
                    account.setAnnualInterest(resultSet.getDouble("annualInterest"));
                    account.setOpenDate(resultSet.getDate("openDate"));
                    account.setCancelationDate(resultSet.getDate("cancelationDate"));
                }
            } catch (SQLException e){
                System.out.println("Cuenta no encontrada: " + e.getMessage());
            }
            return account;
    }

    public BankAccount selectAccountByPersonID(int personID){

        BankAccount account = null;
        Connection connection = DBConnection.getConnection();

        try(
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_USER_ID)){
                preparedStatement.setInt(1, personID);
                ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    account = new BankAccount();
                    account.setAccountNumber(resultSet.getInt("accountNumber"));
                    account.setPersonID(resultSet.getInt("personID"));
                    account.setBalance(resultSet.getDouble("balance"));
                    account.setActive(resultSet.getBoolean("isActive"));
                    account.setCancelled(resultSet.getBoolean("isCancelled"));
                    account.setEmbargoed(resultSet.getBoolean("isEmbargoed"));
                    account.setEmbargoedValue(resultSet.getDouble("embargoedValue"));
                    account.setAnnualInterest(resultSet.getDouble("annualInterest"));
                    account.setOpenDate(resultSet.getDate("openDate"));
                    account.setCancelationDate(resultSet.getDate("cancelationDate"));
                }
            } catch (SQLException e){
                System.out.println("Cuenta no encontrada: " + e.getMessage());
            }
            return account;
    }

    public List<BankAccount> selectAllAccounts(){

        List<BankAccount> accounts = new ArrayList<BankAccount>();
        Connection connection = DBConnection.getConnection();

        try(
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)){

                ResultSet resultSet = preparedStatement.executeQuery();
                while(resultSet.next()){
                    BankAccount account = new BankAccount();
                    account = new BankAccount();
                    account.setAccountNumber(resultSet.getInt("accountNumber"));
                    account.setPersonID(resultSet.getInt("personID"));
                    account.setBalance(resultSet.getDouble("balance"));
                    account.setActive(resultSet.getBoolean("isActive"));
                    account.setCancelled(resultSet.getBoolean("isCancelled"));
                    account.setEmbargoed(resultSet.getBoolean("isEmbargoed"));
                    account.setEmbargoedValue(resultSet.getDouble("embargoedValue"));
                    account.setAnnualInterest(resultSet.getDouble("annualInterest"));
                    account.setOpenDate(resultSet.getDate("openDate"));
                    account.setCancelationDate(resultSet.getDate("cancelationDate"));
                    accounts.add(account);
                }
            } catch (SQLException e){
                System.out.println("Cuenta no encontrada: " + e.getMessage());
            }
            return accounts;
    }


 
}
