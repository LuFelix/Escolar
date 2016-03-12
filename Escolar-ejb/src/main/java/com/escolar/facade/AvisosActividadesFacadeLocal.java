/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.AvisosActividades;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface AvisosActividadesFacadeLocal {

    void create(AvisosActividades avisosActividades);

    void edit(AvisosActividades avisosActividades);

    void remove(AvisosActividades avisosActividades);

    AvisosActividades find(Object id);

    List<AvisosActividades> findAll();

    List<AvisosActividades> findRange(int[] range);

    int count();
    
}
