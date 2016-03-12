/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.AvisosActividades;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ceasar
 */
@Stateless
public class AvisosActividadesFacade extends AbstractFacade<AvisosActividades> implements AvisosActividadesFacadeLocal {
    @PersistenceContext(unitName = "com.local_Escolar-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AvisosActividadesFacade() {
        super(AvisosActividades.class);
    }
    
}
