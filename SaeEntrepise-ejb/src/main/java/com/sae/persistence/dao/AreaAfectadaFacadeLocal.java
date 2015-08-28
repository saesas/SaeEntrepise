/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AreaAfectada;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AreaAfectadaFacadeLocal {

    void create(AreaAfectada areaAfectada);

    void edit(AreaAfectada areaAfectada);

    void remove(AreaAfectada areaAfectada);

    AreaAfectada find(Object id);

    List<AreaAfectada> findAll();

    List<AreaAfectada> findRange(int[] range);

    int count();
    
}
