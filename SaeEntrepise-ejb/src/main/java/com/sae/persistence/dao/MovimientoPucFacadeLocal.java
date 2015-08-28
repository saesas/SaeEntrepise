/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.MovimientoPuc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface MovimientoPucFacadeLocal {

    void create(MovimientoPuc movimientoPuc);

    void edit(MovimientoPuc movimientoPuc);

    void remove(MovimientoPuc movimientoPuc);

    MovimientoPuc find(Object id);

    List<MovimientoPuc> findAll();

    List<MovimientoPuc> findRange(int[] range);

    int count();
    
}
