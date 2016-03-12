/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.MateriasAsignadas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface MateriasAsignadasFacadeLocal {

    void create(MateriasAsignadas materiasAsignadas);

    void edit(MateriasAsignadas materiasAsignadas);

    void remove(MateriasAsignadas materiasAsignadas);

    MateriasAsignadas find(Object id);

    List<MateriasAsignadas> findAll();

    List<MateriasAsignadas> findRange(int[] range);

    int count();
    
}
