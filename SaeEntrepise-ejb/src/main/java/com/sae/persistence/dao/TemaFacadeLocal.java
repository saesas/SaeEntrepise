/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.Tema;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface TemaFacadeLocal {

    void create(Tema tema);

    void edit(Tema tema);

    void remove(Tema tema);

    Tema find(Object id);

    List<Tema> findAll();

    List<Tema> findRange(int[] range);

    int count();
    
}
