
package com.escolar.session;

import com.escolar.entity.Roles;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Carlos Cesar Rosas<face_less@hotmail.com>
 */
@Remote
public interface RolesSessionRemote {
    
    public void create(Roles roles);

    public void edit(Roles roles);

    public void remove(Roles roles);

    public Roles find(Object id);

    public List<Roles> findAll();

    public List<Roles> findRange(int[] range);

    public int count();
}
