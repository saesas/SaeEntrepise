/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.ActaCobroActividad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface ActaCobroActividadFacadeLocal {

    void create(ActaCobroActividad actaCobroActividad);

    void edit(ActaCobroActividad actaCobroActividad);

    void remove(ActaCobroActividad actaCobroActividad);

    ActaCobroActividad find(Object id);

    List<ActaCobroActividad> findAll();

    List<ActaCobroActividad> findRange(int[] range);

    int count();
    
}
