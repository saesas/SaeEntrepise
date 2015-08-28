/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Tercero;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TerceroFacadeLocal {

    void create(Tercero tercero);

    void edit(Tercero tercero);

    void remove(Tercero tercero);

    Tercero find(Object id);

    List<Tercero> findAll();

    List<Tercero> findRange(int[] range);

    int count();
    
}
