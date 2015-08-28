/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Traslado;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TrasladoFacadeLocal {

    void create(Traslado traslado);

    void edit(Traslado traslado);

    void remove(Traslado traslado);

    Traslado find(Object id);

    List<Traslado> findAll();

    List<Traslado> findRange(int[] range);

    int count();
    
}
