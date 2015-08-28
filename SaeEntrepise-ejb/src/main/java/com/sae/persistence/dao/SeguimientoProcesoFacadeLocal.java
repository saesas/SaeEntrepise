/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sae.persistence.dao;

import com.sae.persistence.domain.SeguimientoProceso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Hector Ivan
 */
@Local
public interface SeguimientoProcesoFacadeLocal {

    void create(SeguimientoProceso seguimientoProceso);

    void edit(SeguimientoProceso seguimientoProceso);

    void remove(SeguimientoProceso seguimientoProceso);

    SeguimientoProceso find(Object id);

    List<SeguimientoProceso> findAll();

    List<SeguimientoProceso> findRange(int[] range);

    int count();
    
}
