/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActaInicio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActaInicioFacadeLocal {

    void create(ActaInicio actaInicio);

    void edit(ActaInicio actaInicio);

    void remove(ActaInicio actaInicio);

    ActaInicio find(Object id);

    List<ActaInicio> findAll();

    List<ActaInicio> findRange(int[] range);

    int count();
    
}
