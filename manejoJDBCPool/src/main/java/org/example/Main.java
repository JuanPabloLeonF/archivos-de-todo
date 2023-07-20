package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.example.personas.dto.PersonaDTO;
import org.example.personas.jdbc.Conexion;
import org.example.personas.jdbc.IPersonasDao;
import org.example.personas.jdbc.PersonaDaoJDBC;

public class Main {
    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            IPersonasDao personaDao = new PersonaDaoJDBC(conexion);
            PersonaDTO persona = new PersonaDTO();
            persona.setIdPersona(1);
            personaDao.delete(persona);

            List<PersonaDTO> personas = personaDao.select();
            
            for(PersonaDTO persona1: personas){
                System.out.println("Persona DTO:" + persona1);
            }
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}