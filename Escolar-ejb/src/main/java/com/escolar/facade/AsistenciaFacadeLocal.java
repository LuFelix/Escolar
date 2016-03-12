/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.Asistencia;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface AsistenciaFacadeLocal {

    void create(Asistencia asistencia);

    void edit(Asistencia asistencia);

    void remove(Asistencia asistencia);

    Asistencia find(Object id);

    List<Asistencia> findAll();

    List<Asistencia> findRange(int[] range);

    int count();
    
}
