package com.escolar.session;

import com.escolar.entity.Ciclo;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ceasar
 */
@Remote
public interface CicloSessionRemote {

    public void create(Ciclo ciclo);

    public void edit(Ciclo ciclo);

    public void remove(Ciclo ciclo);

    public Ciclo find(Object id);

    public List<Ciclo> findAll();

    public List<Ciclo> findRange(int[] range);

    public int count();
}
