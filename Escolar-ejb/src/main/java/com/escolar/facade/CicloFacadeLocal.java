/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.Ciclo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface CicloFacadeLocal {

    void create(Ciclo ciclo);

    void edit(Ciclo ciclo);

    void remove(Ciclo ciclo);

    Ciclo find(Object id);

    List<Ciclo> findAll();

    List<Ciclo> findRange(int[] range);

    int count();
    
}
