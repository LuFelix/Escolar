
package com.escolar.facade;

import com.escolar.entity.Usuarios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author ceasar
 */
@Stateless
public class UsuariosFacade extends AbstractFacade<Usuarios> implements UsuariosFacadeLocal {

    @PersistenceContext(unitName = "com.local_Escolar-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuariosFacade() {
        super(Usuarios.class);
    }

    @Override
    public Long agregaRol(String usuario,Integer idrol,Integer idescuela) {
        Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.usuario = :usuario", Usuarios.class);
        query.setParameter("usuario", usuario);
        Usuarios u = (Usuarios) query.getSingleResult();
        em.createNativeQuery("INSERT INTO usuario_rol (idusuario,idrol) values('"+u.getIdusuario()+"','"+idrol+"')").executeUpdate();
        em.createNativeQuery("INSERT INTO usuario_escuela (idusuario,idescuela) values('"+u.getIdusuario()+"','"+idescuela+"')").executeUpdate();
        return u.getIdusuario();
    }

}
