
package com.escolar.session;

import com.escolar.entity.Escuelas;
import com.escolar.facade.EscuelasFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ceasar
 */
@Stateless
public class EscuelasSession implements EscuelasSessionRemote {
    @EJB
    private EscuelasFacadeLocal escuelasFacade;

    @Override
    public void create(Escuelas escuelas) {
        escuelasFacade.create(escuelas);
    }

    @Override
    public void edit(Escuelas escuelas) {
        escuelasFacade.edit(escuelas);
    }

    @Override
    public void remove(Escuelas escuelas) {
        escuelasFacade.remove(escuelas);
    }

    @Override
    public Escuelas find(Object id) {
        return escuelasFacade.find(id);
    }

    @Override
    public List<Escuelas> findAll() {
        return escuelasFacade.findAll();
    }

    @Override
    public List<Escuelas> findRange(int[] range) {
        return escuelasFacade.findRange(range);
    }

    @Override
    public int count() {
        return escuelasFacade.count();
    }

}
