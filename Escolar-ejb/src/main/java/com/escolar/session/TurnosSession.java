
package com.escolar.session;

import com.escolar.entity.Turnos;
import com.escolar.facade.TurnosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ceasar
 */
@Stateless
public class TurnosSession implements TurnosSessionRemote {
    @EJB
    private TurnosFacadeLocal turnosFacade;

    @Override
    public void create(Turnos turnos) {
        turnosFacade.create(turnos);
    }

    @Override
    public void edit(Turnos turnos) {
        turnosFacade.edit(turnos);
    }

    @Override
    public void remove(Turnos turnos) {
        turnosFacade.remove(turnos);
    }

    @Override
    public Turnos find(Object id) {
        return turnosFacade.find(id);
    }

    @Override
    public List<Turnos> findAll() {
        return turnosFacade.findAll();
    }

    @Override
    public List<Turnos> findRange(int[] range) {
        return turnosFacade.findRange(range);
    }

    @Override
    public int count() {
        return turnosFacade.count();
    }

}
