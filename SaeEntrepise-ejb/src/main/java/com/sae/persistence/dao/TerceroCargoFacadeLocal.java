/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.TerceroCargo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TerceroCargoFacadeLocal {

    void create(TerceroCargo terceroCargo);

    void edit(TerceroCargo terceroCargo);

    void remove(TerceroCargo terceroCargo);

    TerceroCargo find(Object id);

    List<TerceroCargo> findAll();

    List<TerceroCargo> findRange(int[] range);

    int count();
    
}
