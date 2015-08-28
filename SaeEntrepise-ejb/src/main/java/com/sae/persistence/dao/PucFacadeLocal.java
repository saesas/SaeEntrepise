/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Puc;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface PucFacadeLocal {

    void create(Puc puc);

    void edit(Puc puc);

    void remove(Puc puc);

    Puc find(Object id);

    List<Puc> findAll();

    List<Puc> findRange(int[] range);

    int count();
    
}
