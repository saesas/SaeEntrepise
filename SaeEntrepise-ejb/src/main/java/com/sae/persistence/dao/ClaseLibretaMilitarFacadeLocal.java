/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ClaseLibretaMilitar;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ClaseLibretaMilitarFacadeLocal {

    void create(ClaseLibretaMilitar claseLibretaMilitar);

    void edit(ClaseLibretaMilitar claseLibretaMilitar);

    void remove(ClaseLibretaMilitar claseLibretaMilitar);

    ClaseLibretaMilitar find(Object id);

    List<ClaseLibretaMilitar> findAll();

    List<ClaseLibretaMilitar> findRange(int[] range);

    int count();
    
}
