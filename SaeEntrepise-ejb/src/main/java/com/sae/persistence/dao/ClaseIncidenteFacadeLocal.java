/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ClaseIncidente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ClaseIncidenteFacadeLocal {

    void create(ClaseIncidente claseIncidente);

    void edit(ClaseIncidente claseIncidente);

    void remove(ClaseIncidente claseIncidente);

    ClaseIncidente find(Object id);

    List<ClaseIncidente> findAll();

    List<ClaseIncidente> findRange(int[] range);

    int count();
    
}
