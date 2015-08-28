/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ClasePuc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ClasePucFacadeLocal {

    void create(ClasePuc clasePuc);

    void edit(ClasePuc clasePuc);

    void remove(ClasePuc clasePuc);

    ClasePuc find(Object id);

    List<ClasePuc> findAll();

    List<ClasePuc> findRange(int[] range);

    int count();
    
}
