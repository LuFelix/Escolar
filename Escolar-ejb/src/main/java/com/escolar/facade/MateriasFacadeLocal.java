/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.Materias;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface MateriasFacadeLocal {

    void create(Materias materias);

    void edit(Materias materias);

    void remove(Materias materias);

    Materias find(Object id);

    List<Materias> findAll();

    List<Materias> findRange(int[] range);

    int count();
    
}
