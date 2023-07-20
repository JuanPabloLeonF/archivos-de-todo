package org.example;

import org.example.personas.dto.PersonaDTO;
import org.example.personas.jdbc.Conexion;
import org.example.personas.jdbc.IPersonasDao;
import org.example.personas.jdbc.PersonaDaoJDBC;
import org.example.personas.jdbc.UsuarioDaoJDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MainUsuario {

    public static void main(String[] args) {


        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            IPersonasDao usuarioDao =  new UsuarioDaoJDBC(conexion);
            PersonaDTO usuario = new PersonaDTO();
            usuario.setNombre("camilo");
            usuario.setApellido("fernandes");
            usuarioDao.insert(usuario);

            List<PersonaDTO> usuarios = usuarioDao.select();

            for(PersonaDTO usuario1: usuarios){
                System.out.println("Usuario DTO:" + usuario1);
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
