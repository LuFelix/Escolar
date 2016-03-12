/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escolar.facade;

import com.escolar.entity.Escuelas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ceasar
 */
@Local
public interface EscuelasFacadeLocal {

    void create(Escuelas escuelas);

    void edit(Escuelas escuelas);

    void remove(Escuelas escuelas);

    Escuelas find(Object id);

    List<Escuelas> findAll();

    List<Escuelas> findRange(int[] range);

    int count();
    
}
