package controller.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import model.dao.PersonDAO;
import controller.beansDB.Person;

@WebServlet("/register")
public class Register extends HttpServlet {

    private PersonDAO personDAO;

    public Register(){
        this.personDAO = new PersonDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {

        String document = request.getParameter("document");
        String firstName = request.getParameter("name");
        String secondName = request.getParameter("second-name");
        String lastName1 = request.getParameter("lastname1");
        String lastName2 = request.getParameter("lastname2");
        String birthPlace = request.getParameter("birthplace");
        String hometown = request.getParameter("hometown");
        String address = request.getParameter("address");
        String cellPhoneNumber = request.getParameter("cell-phone");
        String email = request.getParameter("email");
        Boolean admin = false;

        LocalDate today = LocalDate.now();
        Date registrationDate = Date.valueOf(today);

        // Se encripta la contraseña utilizando la libreria 'jBCrypt'
        //String contraseñaEncriptada = encriptarContraseña(contraseña);

        Person newPerson = new Person(document, firstName, secondName, lastName1, lastName2, birthPlace,
                                    hometown, address, cellPhoneNumber, email, registrationDate, admin);
        personDAO.insertPerson(newPerson);

        // Redireccionamos a la página de registro exitoso
        response.sendRedirect("index.jsp");
    }


}
