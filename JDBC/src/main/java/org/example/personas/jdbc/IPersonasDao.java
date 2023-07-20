package org.example.personas.jdbc;

import org.example.personas.dto.PersonaDTO;

import java.sql.SQLException;
import java.util.List;

public interface IPersonasDao {

    int insert(PersonaDTO persona) throws SQLException;
    int update(PersonaDTO persona) throws SQLException;
    int delete(PersonaDTO persona) throws SQLException;
    List<PersonaDTO> select() throws SQLException;
}
