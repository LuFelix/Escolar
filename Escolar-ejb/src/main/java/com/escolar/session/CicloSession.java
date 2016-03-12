
package com.escolar.session;

import com.escolar.entity.Ciclo;
import com.escolar.facade.CicloFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ceasar
 */
@Stateless
public class CicloSession implements CicloSessionRemote {
    @EJB
    private CicloFacadeLocal cicloFacade;

    @Override
    public void create(Ciclo ciclo) {
        cicloFacade.create(ciclo);
    }

    @Override
    public void edit(Ciclo ciclo) {
        cicloFacade.edit(ciclo);
    }

    @Override
    public void remove(Ciclo ciclo) {
        cicloFacade.remove(ciclo);
    }

    @Override
    public Ciclo find(Object id) {
        return cicloFacade.find(id);
    }

    @Override
    public List<Ciclo> findAll() {
        return cicloFacade.findAll();
    }

    @Override
    public List<Ciclo> findRange(int[] range) {
        return cicloFacade.findRange(range);
    }

    @Override
    public int count() {
        return cicloFacade.count();
    }

}
