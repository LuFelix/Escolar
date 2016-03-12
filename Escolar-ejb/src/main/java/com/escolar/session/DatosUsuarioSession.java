
package com.escolar.session;

import com.escolar.entity.DatosUsuario;
import com.escolar.facade.DatosUsuarioFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ceasar
 */
@Stateless
public class DatosUsuarioSession implements DatosUsuarioSessionRemote {
    @EJB
    private DatosUsuarioFacadeLocal datosUsuarioFacade;

    @Override
    public void create(DatosUsuario datosUsuario) {
        datosUsuarioFacade.create(datosUsuario);
    }

    @Override
    public void edit(DatosUsuario datosUsuario) {
        datosUsuarioFacade.edit(datosUsuario);
    }

    @Override
    public void remove(DatosUsuario datosUsuario) {
        datosUsuarioFacade.remove(datosUsuario);
    }

    @Override
    public DatosUsuario find(Object id) {
        return datosUsuarioFacade.find(id);
    }

    @Override
    public List<DatosUsuario> findAll() {
        return datosUsuarioFacade.findAll();
    }

    @Override
    public List<DatosUsuario> findRange(int[] range) {
        return datosUsuarioFacade.findRange(range);
    }

    @Override
    public int count() {
        return datosUsuarioFacade.count();
    }
}
