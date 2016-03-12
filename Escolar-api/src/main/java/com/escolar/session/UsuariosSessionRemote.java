
package com.escolar.session;

import com.escolar.entity.Usuarios;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author ceasar
 */
@Remote
public interface UsuariosSessionRemote {
    
    public void create(Usuarios usuarios);

    public void edit(Usuarios usuarios);

    public void remove(Usuarios usuarios);

    public Usuarios find(Object id);

    public List<Usuarios> findAll();

    public List<Usuarios> findRange(int[] range);

    public int count();
    
    public Long agregaRol(String usuario,Integer idrol,Integer idescuela);
}
