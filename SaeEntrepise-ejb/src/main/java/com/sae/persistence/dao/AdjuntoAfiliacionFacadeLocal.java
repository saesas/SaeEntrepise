/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.AdjuntoAfiliacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface AdjuntoAfiliacionFacadeLocal {

    void create(AdjuntoAfiliacion adjuntoAfiliacion);

    void edit(AdjuntoAfiliacion adjuntoAfiliacion);

    void remove(AdjuntoAfiliacion adjuntoAfiliacion);

    AdjuntoAfiliacion find(Object id);

    List<AdjuntoAfiliacion> findAll();

    List<AdjuntoAfiliacion> findRange(int[] range);

    int count();
    
}
