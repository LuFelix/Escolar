package com.escolar.session;

import com.escolar.entity.Turnos;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ceasar
 */
@Remote
public interface TurnosSessionRemote {

    public void create(Turnos turnos);

    public void edit(Turnos turnos);

    public void remove(Turnos turnos);

    public Turnos find(Object id);

    public List<Turnos> findAll();

    public List<Turnos> findRange(int[] range);

    public int count();
}
