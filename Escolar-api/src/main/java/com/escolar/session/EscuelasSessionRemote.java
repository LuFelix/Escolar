package com.escolar.session;

import com.escolar.entity.Escuelas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ceasar
 */
@Remote
public interface EscuelasSessionRemote {

    public void create(Escuelas escuelas);

    public void edit(Escuelas escuelas);

    public void remove(Escuelas escuelas);

    public Escuelas find(Object id);

    public List<Escuelas> findAll();

    public List<Escuelas> findRange(int[] range);

    public int count();
}
