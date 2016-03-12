
package com.escolar.session;

import com.escolar.entity.Usuarios;
import com.escolar.facade.UsuariosFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author ceasar
 */
@Stateless
public class UsuariosSession implements UsuariosSessionRemote {
    @EJB
    private UsuariosFacadeLocal usuariosFacade;

    @Override
    public void create(Usuarios usuarios) {
        usuariosFacade.create(usuarios);
    }

    @Override
    public void edit(Usuarios usuarios) {
        usuariosFacade.edit(usuarios);
    }

    @Override
    public void remove(Usuarios usuarios) {
        usuariosFacade.remove(usuarios);
    }

    @Override
    public Usuarios find(Object id) {
        return usuariosFacade.find(id);
    }

    @Override
    public List<Usuarios> findAll() {
        return usuariosFacade.findAll();
    }

    @Override
    public List<Usuarios> findRange(int[] range) {
        return usuariosFacade.findRange(range);
    }

    @Override
    public int count() {
        return usuariosFacade.count();
    }

    @Override
    public Long agregaRol(String usuario, Integer idrol, Integer idescuela) {
        return usuariosFacade.agregaRol(usuario, idrol, idescuela);
    }
    
}
