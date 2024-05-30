package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controller.beansDB.Person;

public class PersonDAO {

    // SQL Queries para hacer el CRUD (Create, Read, Update, Delete)
    private static final String INSERT_PERSON = "INSERT INTO person (document," +
                                                                        "firstName," +
                                                                        "secondName," +
                                                                        "lastName1," +
                                                                        "lastName2," +
                                                                        "birthPlace," +
                                                                        "hometown," +
                                                                        "address," +
                                                                        "cellPhoneNumber," +
                                                                        "email," +
                                                                        "registrationDate," +
                                                                        "isAdmin )" +
                                                                        "VALUES" + 
                                                                        "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_PERSON_ID = "SELECT * FROM person WHERE personID = ?";
    private static final String SELECT_PERSON_DOC = "SELECT * FROM person WHERE document = ?";
    private static final String SELECT_ALL = "SELECT * FROM person";
    private static final String DELETE_PERSON = "DELETE FROM person WHERE personID = ?";
    private static final String UPDATE_PERSON = "UPDATE person SET document = ?," +
                                                                   "firstName = ?," +
                                                                   "secondName = ?," + 
                                                                   "lastName1 = ?," +
                                                                   "lastName2 = ?," +
                                                                   "birthPlace = ?," +
                                                                   "hometown = ?," +
                                                                   "address = ?," +
                                                                   "cellPhoneNumber = ?," +
                                                                   "email = ?," +
                                                                   "registrationDate = ?," +
                                                                   "isAdmin = ? WHERE personID = ?";
    // Crear una persona
    public void insertPerson(Person newPerson) {
        
        Connection connection = DBConnection.getConnection();
        try (
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON)) {
            preparedStatement.setString(1, newPerson.getDocument());
            preparedStatement.setString(2, newPerson.getFirstName());
            preparedStatement.setString(3, newPerson.getSecondName());
            preparedStatement.setString(4, newPerson.getLastName1());
            preparedStatement.setString(5, newPerson.getLastName2());
            preparedStatement.setString(6, newPerson.getBirthPlace());
            preparedStatement.setString(7, newPerson.getHometown());
            preparedStatement.setString(8, newPerson.getAddress());
            preparedStatement.setString(9, newPerson.getCellPhoneNumber());
            preparedStatement.setString(10, newPerson.getEmail());
            preparedStatement.setDate(11, newPerson.getReistrationDate());
            preparedStatement.setBoolean(12, newPerson.isAdmin());
            preparedStatement.executeUpdate();
            System.out.println("Usuario insertado exitosamente a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar un usuario: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
    }

    public void updatePerson(int personID, Person newPerson){

        Connection connection = DBConnection.getConnection();

        try (
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PERSON)) {

                preparedStatement.setString(1, newPerson.getDocument());
                preparedStatement.setString(2, newPerson.getFirstName());
                preparedStatement.setString(3, newPerson.getSecondName());
                preparedStatement.setString(4, newPerson.getLastName1());
                preparedStatement.setString(5, newPerson.getLastName2());
                preparedStatement.setString(6, newPerson.getBirthPlace());
                preparedStatement.setString(7, newPerson.getHometown());
                preparedStatement.setString(8, newPerson.getAddress());
                preparedStatement.setString(9, newPerson.getCellPhoneNumber());
                preparedStatement.setString(10, newPerson.getEmail());
                preparedStatement.setDate(11, newPerson.getReistrationDate());
                preparedStatement.setBoolean(12, newPerson.isAdmin());
                preparedStatement.setInt(13,personID);
                preparedStatement.executeUpdate();
                System.out.println("Usuario actualizado exitosamente a la base de datos");
            } catch (SQLException e) {
                System.out.println("Error al actualizar: " + e.getMessage());
            }

            DBConnection.closeConnection(connection);
    }

    public void deletePerson(int personID){

        Connection connection = DBConnection.getConnection();
        
        try (
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PERSON)){

                preparedStatement.execute();
        } catch(SQLException e){
            System.out.println("Error al eliminar usuario con id: "+personID);
        }

        DBConnection.closeConnection(connection);
    }

    // Se retorna una persona de acuerdo a su personID (clave primaria es única)
    public Person selectPersonByID(int personID) {
        Person person = null;
        Connection connection = DBConnection.getConnection();
        
        try (
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PERSON_ID)) {
            
                preparedStatement.setInt(1, personID);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    person = new Person();
                    person.setPersonID(resultSet.getInt("personID"));
                    person.setDocument(resultSet.getString("document"));
                    person.setFirstName(resultSet.getString("firstName"));
                    person.setSecondName(resultSet.getString("secondName"));
                    person.setLastName1(resultSet.getString("lastName1"));
                    person.setLastName2(resultSet.getString("lastName2"));
                    person.setBirthPlace(resultSet.getString("birthPlace"));
                    person.setHometown(resultSet.getString("hometown"));
                    person.setAddress(resultSet.getString("address"));
                    person.setCellPhoneNumber(resultSet.getString("cellPhoneNumber"));
                    person.setEmail(resultSet.getString("email"));
                    person.setReistrationDate(resultSet.getDate("registrationDate"));
                    person.setAsAdmin(resultSet.getBoolean("isAdmin"));
                }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar un usuario por cédula: " + e.getMessage());
        }
        DBConnection.closeConnection(connection);
        return person;
    }

    // Se retorna una persona (o varias personas) persona de acuerdo a su documento de identidad
    public List<Person> selectPersonByDocument(String document) {
        
        List<Person> persons = new ArrayList<>();
        Connection connection = DBConnection.getConnection();

        try (
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PERSON_DOC)) {
            
                preparedStatement.setString(1, document);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Person person = new Person();
                    person.setPersonID(resultSet.getInt("personID"));
                    person.setDocument(resultSet.getString("document"));
                    person.setFirstName(resultSet.getString("firstName"));
                    person.setSecondName(resultSet.getString("secondName"));
                    person.setLastName1(resultSet.getString("lastName1"));
                    person.setLastName2(resultSet.getString("lastName2"));
                    person.setBirthPlace(resultSet.getString("birthPlace"));
                    person.setHometown(resultSet.getString("hometown"));
                    person.setAddress(resultSet.getString("address"));
                    person.setCellPhoneNumber(resultSet.getString("cellPhoneNumber"));
                    person.setEmail(resultSet.getString("email"));
                    person.setReistrationDate(resultSet.getDate("registrationDate"));
                    person.setAsAdmin(resultSet.getBoolean("isAdmin"));
                    persons.add(person);
                }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar un usuario por cédula: " + e.getMessage());
        }

        DBConnection.closeConnection(connection);
        return persons;
    }

    // Se obtienen los datos de todas las personas registradas
    public List<Person> selectAllPersons() {
        List<Person> persons = new ArrayList<>();
        Connection connection = DBConnection.getConnection();

        try (
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    Person person = new Person();
                    person.setPersonID(resultSet.getInt("personID"));
                    person.setDocument(resultSet.getString("document"));
                    person.setFirstName(resultSet.getString("firstName"));
                    person.setSecondName(resultSet.getString("secondName"));
                    person.setLastName1(resultSet.getString("lastName1"));
                    person.setLastName2(resultSet.getString("lastName2"));
                    person.setBirthPlace(resultSet.getString("birthPlace"));
                    person.setHometown(resultSet.getString("hometown"));
                    person.setAddress(resultSet.getString("address"));
                    person.setCellPhoneNumber(resultSet.getString("cellPhoneNumber"));
                    person.setEmail(resultSet.getString("email"));
                    person.setReistrationDate(resultSet.getDate("registrationDate"));
                    person.setAsAdmin(resultSet.getBoolean("isAdmin"));
                    persons.add(person);
                }
            } catch (SQLException e) {
            System.out.println("Error al seleccionar todos los usuarios: " + e.getMessage());
            }

        DBConnection.closeConnection(connection);
        return persons;
    }

}
