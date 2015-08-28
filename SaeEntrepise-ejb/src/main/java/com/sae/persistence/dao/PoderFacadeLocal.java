/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Poder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PoderFacadeLocal {

    void create(Poder poder);

    void edit(Poder poder);

    void remove(Poder poder);

    Poder find(Object id);

    List<Poder> findAll();

    List<Poder> findRange(int[] range);

    int count();
    
}
