/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.jonjts.assistant.control;

import br.com.jonjts.assistant.persistence.PacientePersistencia;
import br.com.jonjts.assistant.entity.Paciente;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jonas
 */
public class PacienteControle implements IControl<Paciente>{
    
    private PacientePersistencia pacienteDAO;

    public ConnectionSource getConnection(){
        return pacienteDAO.getConnectionSource();
    }
    private PacientePersistencia getPacienteDAO() throws SQLException {
        if(pacienteDAO == null){
            pacienteDAO = new PacientePersistencia();
            return pacienteDAO;
        }else{
            return pacienteDAO;
        }
    }

    @Override
    public Paciente get(Number id) throws Exception {
        return getPacienteDAO().findById(id.longValue());
    }
 
    @Override
    public Paciente insert(Paciente object) throws Exception {
        synchronized("insert"){
            getPacienteDAO().persist(object);
            return getPacienteDAO().getLast(Paciente.FILD_ID);
        }
    }

    @Override
    public List<Paciente> getAll() throws Exception {
        QueryBuilder<Paciente, Long> builder = getPacienteDAO().queryBuilder();
        List<Paciente> query = builder.where().eq(Paciente.FILD_STATUS, 1).query();
        return query; 
    }

    @Override
    public void delete(Number id) throws Exception {
        Paciente get = get(id);
        get.setStatus(false);
        update(get);
    }
    
    public void restore(Long id) throws Exception{
        Paciente get = get(id);
        get.setStatus(true);
        update(get);
    }

    @Override
    public void update(Paciente object) throws Exception {
        getPacienteDAO().update(object);
    }
    
    public List<Paciente> searchByName(String nome) throws SQLException{
        QueryBuilder<Paciente, Long> builder = getPacienteDAO().queryBuilder();
        List<Paciente> query = builder.where().like(Paciente.FILD_NOME, "%"+nome+"%").and().eq(Paciente.FILD_STATUS, 1).query();
        return query; 
    }
    
    public List<Paciente> searchByNameExcluidos(String nome) throws SQLException{
        QueryBuilder<Paciente, Long> builder = getPacienteDAO().queryBuilder();
        List<Paciente> query = builder.where().like(Paciente.FILD_NOME, "%"+nome+"%").and().eq(Paciente.FILD_STATUS, 0).query();
        return query; 
    }

}
